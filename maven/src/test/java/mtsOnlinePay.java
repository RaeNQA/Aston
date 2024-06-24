import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class mtsOnlinePay {

        private WebDriver driver;
    SoftAssertions softAssertions = new SoftAssertions();

        @BeforeEach
        public void setUp () {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.mts.by/");
            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.presenceOfElementLocated((By.xpath( "//div[@class=\"pay__wrapper\"]/h2"))));

            WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[@id=\"cookie-agree\"]"));
            if (acceptCookiesButton.isDisplayed()) {
                acceptCookiesButton.click();
            }
        }

        @AfterEach
        public void tearDown () {
            if (driver != null) {
                driver.quit();
            }
        }

        @Test
        public void testBlockTitle () {

            WebElement blockTitle = driver.findElement(By.xpath("//div[@class=\"pay__wrapper\"]/h2"));
            String actualTitle = blockTitle.getText();
            String expectedTitle = "Онлайн пополнение\nбез комиссии1";
            assertEquals(expectedTitle, actualTitle, "Текст блока не соответствует ожидаемому");
        }
        @Test
        public void testBlock() {
            WebElement blockCheck = driver.findElement(By.xpath("//div[@class= 'pay__wrapper']"));
            assertNotNull(blockCheck,"Блок онлайн оплаты отсутствует");

        }
        @Test
        public void testPaymentSystemLogos () {

            WebElement visaLogo = driver.findElement(By.xpath("/html//ul/li[1]/img"));
            WebElement visaVerified = driver.findElement(By.xpath("/html//ul/li[2]/img"));
            WebElement mastercardLogo = driver.findElement(By.xpath("/html//ul/li[3]/img"));
            WebElement masterCardSecure = driver.findElement(By.xpath("/html//ul/li[4]/img"));
            WebElement belkartLogo = driver.findElement(By.xpath("/html//ul/li[5]/img"));

            softAssertions.assertThat(visaLogo).as("Логотип Visa не найден").isNotNull();
            softAssertions.assertThat(visaVerified).as("Логотип Verified By Visa не найден").isNotNull();
            softAssertions.assertThat(mastercardLogo).as("Логотип MasterCard не найден").isNotNull();
            softAssertions.assertThat(masterCardSecure).as("Логотип MasterCard Secure Code не найден").isNotNull();
            softAssertions.assertThat(belkartLogo).as("Логотип Белкарт не найден").isNotNull();
        }

        @Test
        public void testMoreInfoLink () {
            WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
            assertNotNull(moreInfoLink, "Ссылка 'Подробнее о сервисе' не найдена");
            moreInfoLink.click();
            String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
            assertEquals(expectedUrl, driver.getCurrentUrl(), "Ссылка 'Подробнее о сервисе' ведет на неправильную страницу");
        }

        @Test
        public void testTopUpService () throws InterruptedException  {

            WebElement serviceDropdown = driver.findElement(By.xpath("//span[@class=\"select__now\"]"));
            serviceDropdown.click();

            WebElement serviceOption = driver.findElement(By.xpath("//div[@class=\"pay__forms\"]"));
            serviceOption.click();

            WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
            phoneNumberField.sendKeys("297777777");

            WebElement amountField = driver.findElement(By.id("connection-sum"));
            amountField.sendKeys("1");

            WebElement emailField = driver.findElement(By.id("connection-email"));
            emailField.sendKeys("test@example.com");

            WebElement continueButton = driver.findElement(By.xpath("//form[@class=\"pay-form opened\"]/button"));
            softAssertions.assertThat(continueButton).as("Кнопка не найдена").isNotNull();
            softAssertions.assertThat(continueButton.isDisplayed()).as("Кнопка не видима").isTrue();
            continueButton.click();
        }
    }
