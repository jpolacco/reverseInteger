/**
 * Utility methods for integers.
 *
 * @author Joe Polacco
 * @version July 6, 2026
 */
public class IntegerUtils {

    /**
     * Reverses the digits of an integer.
     *
     * Examples:
     *   123   -> 321
     *   -450  -> -54
     *   1200  -> 21
     *
     * @param n the integer to reverse
     * @return the reversed integer
     * @throws ArithmeticException if the reversed integer overflows
     */
    public static int reverse(int n) {

        int reversed = 0;

        while (n != 0) {  // n = -54 

            int digit = n % 10; // 4, -5
            n /= 10; // n = -5 , 0 

            // Check for positive overflow
            if (reversed > Integer.MAX_VALUE / 10 ||
                (reversed == Integer.MAX_VALUE / 10 &&
                 digit > Integer.MAX_VALUE % 10)) {

                throw new ArithmeticException("Integer overflow");
            }

            // Check for negative overflow
            if (reversed < Integer.MIN_VALUE / 10 ||
                (reversed == Integer.MIN_VALUE / 10 &&
                 digit < Integer.MIN_VALUE % 10)) {

                throw new ArithmeticException("Integer overflow");
            }

            reversed = reversed * 10 + digit;  // reversed = 4
            // 4*10 - 5
        }

        return reversed;
    }
}