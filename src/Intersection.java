import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 3, 4, 5};
        int[] nums2 = new int[]{3, 4, 4, 5, 6, 7};

        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }

    private static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        for (int j : nums1) {
            for (int i : nums2) {
                if (j == i) {
                    intersection.add(j);
                }
            }
        }
        int[] arrayWithoutDuplicates = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            arrayWithoutDuplicates[index++] = num;
        }
        return arrayWithoutDuplicates;
    }
}
