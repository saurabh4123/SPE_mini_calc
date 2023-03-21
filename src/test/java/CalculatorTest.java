import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    private static final double epsilon = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.factorial(4),epsilon );
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.factorial(5), epsilon);
    }
    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial of a number for True Negative", 78, calculator.factorial(5), epsilon);
        assertNotEquals("Finding factorial of a number for True Negative", 47, calculator.factorial(10), epsilon);
    }
    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 512, calculator.power(2, 9), epsilon);
        assertEquals("Finding power for True Positive", 25, calculator.power(5, 2), epsilon);
    }
    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 69, calculator.power(2, 2), epsilon);
        assertNotEquals("Finding power for True Negative", -4, calculator.power(-2, 2), epsilon);
    }
    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), epsilon);
        assertEquals("Finding natural log for True Positive", 5.703782474656201, calculator.naturalLog(300), epsilon);
    }
    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 755, calculator.naturalLog(2.4), epsilon);
        assertNotEquals("Finding natural log for True Negative", 4541, calculator.naturalLog(2.1), epsilon);
    }
    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 10, calculator.squareRoot(100), epsilon);
        assertEquals("Finding square root for True Positive", 121, calculator.squareRoot(14641), epsilon);
    }
    @Test
    public void sqrootTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 45, calculator.squareRoot(3), epsilon);
        assertNotEquals("Finding square root for True Negative", 4, calculator.squareRoot(4), epsilon);
    }
}
