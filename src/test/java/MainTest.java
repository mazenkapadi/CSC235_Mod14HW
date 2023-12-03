import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testSumOfPrimesWithDigit5_NegativeInput() {
        int result = Main.sumOfPrimesWithDigit5(-10);
        assertEquals(0, result);
    }

    @Test
    public void testSumOfPrimesWithDigit5_N0() {
        int result = Main.sumOfPrimesWithDigit5(0);
        assertEquals(0, result);
    }

    @Test
    public void testSumOfPrimesWithDigit5_N10() {
        int result = Main.sumOfPrimesWithDigit5(10);
        assertEquals(5, result);
    }

    @Test
    public void testSumOfPrimesWithDigit5_N100() {
        int result = Main.sumOfPrimesWithDigit5(100);
        assertEquals(117, result);
    }
}
