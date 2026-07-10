import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Tests for IntegerUtils.reverse(int).
 *
 * @author Joe Polacco
 * @version July 6, 2026
 */
public class IntegerUtilsTest {

    @Test
    public void testZero() {
        IntegerUtils utils = new IntegerUtils();

        assertEquals(0, utils.reverse(0));
    }

    @Test
    public void testSingleDigitNumbers() {
        IntegerUtils utils = new IntegerUtils();

        assertEquals(5, utils.reverse(5));
        assertEquals(9, utils.reverse(9));
    }

    @Test
    public void testPositiveNumbers() {
        IntegerUtils utils = new IntegerUtils();

        assertEquals(21, utils.reverse(12));
        assertEquals(321, utils.reverse(123));
        assertEquals(54321, utils.reverse(12345));
        assertEquals(1001, utils.reverse(1001));
    }

    @Test
    public void testTrailingZeros() {
        IntegerUtils utils = new IntegerUtils();

        assertEquals(21, utils.reverse(120));
        assertEquals(54, utils.reverse(4500));
        assertEquals(9, utils.reverse(9000));
    }

    @Test
    public void testNegativeNumbers() {
        IntegerUtils utils = new IntegerUtils();

        assertEquals(-321, utils.reverse(-123));
        assertEquals(-21, utils.reverse(-120));
        assertEquals(-5, utils.reverse(-5));
    }

    @Test
    public void testRandomPositiveNumbers() {
        IntegerUtils utils = new IntegerUtils();
        

        for (int i = 0; i < 10000; i++) {
            
            int n = (int) (Math.random() * 1_000_000_000);
            
            // String version of reversing an int
            // You must use mathematical operations in your solution:
            //          %, /, +, etc...
            
            String reversed =
                    new StringBuilder(Integer.toString(n))
                            .reverse()
                            .toString();

            int expected = Integer.parseInt(reversed);

            assertEquals(expected,
                         utils.reverse(n),
                         "Failed for input: " + n);
        }
    }

    @Test
    public void testRandomNegativeNumbers() {
        IntegerUtils utils = new IntegerUtils();


        for (int i = 0; i < 10000; i++) {
            int n = (int) (Math.random() * 1_000_000_000);
          
            // String version of reversing an int
            // You must use mathematical operations in your solution:
            //          %, /, +, etc...
    
            String reversed =
                    new StringBuilder(Integer.toString(n))
                            .reverse()
                            .toString();

            int expected = -Integer.parseInt(reversed);

            assertEquals(expected,
                         utils.reverse(-n),
                         "Failed for input: " + (-n));
        }
    }
}