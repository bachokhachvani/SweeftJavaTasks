import java.util.Arrays;
import java.util.HashMap;

public class LongSubArr {

    public static void main(String[] args) {
        int[] nums = new int[]{6,2,2,3,4,1};
        int k = 8;
        System.out.println(lenOfLongSubarr(nums, k));
    }
    private static int lenOfLongSubarr(int[] array, int k) {
        Arrays.sort(array);
        {
            int maxlength = 0;
            for (int i = 0; i < array.length; i++) {
                int Sum = 0;
                for (int j = i; j < array.length; j++) {
                    Sum += array[j];
                    if (Sum == k) {
                        maxlength = Math.max(maxlength, j - i + 1);
                    }
                }
            }
            return maxlength;
        }
    }
}