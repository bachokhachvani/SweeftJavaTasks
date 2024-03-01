import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Sequence {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = new int[]{1, 6, -1, 10};

        System.out.println(isValidSequence(array, sequence));
    }

    private static boolean isValidSequence(int[] array, int[] sequence) {
        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> copyOfIndexes = new ArrayList<>();

        for (var e : sequence) {
            for (var i = 0; i < array.length; i++) {
                if (e == array[i]) {
                    indexes.add(i);
                    copyOfIndexes.add(i);
                }
            }
        }

        Collections.sort(indexes);

        if (indexes.size() != sequence.length) {
            return false;
        }

        for (var i = 0; i < indexes.size(); i++) {
            if (!Objects.equals(indexes.get(i), copyOfIndexes.get(i))) {
                return false;
            }
        }
        return true;
    }
}
