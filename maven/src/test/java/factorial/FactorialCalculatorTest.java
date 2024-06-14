package factorial;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialCalculatorTest {
    @Test
    public void testFactorialofZero(){
        long result = FactorialCalculator.factorial(0);
        assertEquals(result, 1, "Факториал 0 возвращает 1");
    }
    @Test
    public void testFactorialOfPositiveNumber(){
        long result = FactorialCalculator.factorial(5);
        assertEquals(result,  120, "Проверка положительного числа 5! = 120");
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
    @Test
    public void testAdd() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.add(3, 4);
        assertEquals(result, 7, "Сумма 3 и 4 должна быть равна 7");
    }
}