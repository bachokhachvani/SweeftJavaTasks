public class ExpressionEvaluator {
    public static void main(String[] args) {
        String expression = "5+20-8+5";
        System.out.println(evaluateExpression(expression));
    }

    private static int evaluateExpression(String expression) {
        int sum = 0;
        int num = 0;
        char sign = '+';
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if (!Character.isDigit(c) || i == expression.length() - 1) {
                if (sign == '+') {
                    sum += num;
                } else if (sign == '-') {
                    sum -= num;
                }
                sign = c;
                num = 0;
            }
        }
        return sum;
    }
}
