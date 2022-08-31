import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(nums));
        int val = 5;
        int result = removeElement(nums, val);
        System.out.println(result);
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

}
