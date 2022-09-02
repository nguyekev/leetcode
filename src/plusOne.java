import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] array = new int[digits.length + 1];
        array[0] = 1;
        for (int i = digits.length - 1; i > 0; i--) {
            array[i + 1] = digits[i];
        }
        return array;
    }
}
