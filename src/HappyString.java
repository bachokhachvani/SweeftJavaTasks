import java.util.List;
import java.util.Objects;

public class HappyString {
    public static void main(String[] args) {
        String[] strings = new String[]{"abbcc", "abc", "abcabc", "cabcbb"};
        int result = numberOfHappyStrings(List.of(strings));
        System.out.println(result);
    }

    private static int numberOfHappyStrings(List<String> strings) {
        int counter = 0;
        for (String e : strings) {
            var k = e.split("");
            if (isHappyString(List.of(k))) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isHappyString(List<String> strings) {
        boolean result = true;
        for (var i = 0; i < strings.size() - 1; i++) {
            if (Objects.equals(strings.get(i), strings.get(i + 1))) {
                result = false;
            }
        }
        return result;
    }
}
