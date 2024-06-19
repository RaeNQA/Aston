import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class mtsOnlinePay {

        private WebDriver driver;

        @BeforeEach
        public void setUp () {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.mts.by/");

            WebElement acceptCookiesButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
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
            WebElement blockTitle = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));

            String actualTitle = blockTitle.getText();

            String expectedTitle = "Онлайн пополнение\nбез комиссии";
            assertEquals(expectedTitle, actualTitle, "Текст блока не соответствует ожидаемому");
        }
        @Test
        public void testBlock() {
            WebElement blockCheck = driver.findElement(By.xpath("//*[contains(@class, 'pay__wrapper')]"));
            assertNotNull(blockCheck,"Блок онлайн оплаты отсутствует");

        }
        @Test
        public void testPaymentSystemLogos () {
            WebElement visaLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
            WebElement visaVerified = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img"));
            WebElement mastercardLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
            WebElement masterCardSecure = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
            WebElement belkartLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
            assertNotNull(visaLogo, "Логотип Visa не найден");
            assertNotNull(visaVerified,"Логотип Verified By Visa не найден");
            assertNotNull(mastercardLogo, "Логотип MasterCard не найден");
            assertNotNull(masterCardSecure, "Логотип MasterCard Secure Code не найден");
            assertNotNull(belkartLogo, "Логотип Белкарт не найден");
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

            WebElement serviceDropdown = driver.findElement(By.id("pay-section"));
            serviceDropdown.click();

            WebElement serviceOption = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[1]"));
            serviceOption.click();

            WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
            phoneNumberField.sendKeys("297777777");

            WebElement amountField = driver.findElement(By.id("connection-sum"));
            amountField.sendKeys("1");

            WebElement emailField = driver.findElement(By.id("connection-email"));
            emailField.sendKeys("test@example.com");

            WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
            continueButton.click();
        }
    }
