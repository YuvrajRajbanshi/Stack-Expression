package Stack;

import java.util.Stack;

public class EvaluationPost {
    public static int evaluatePostfix(String[] s) {
        Stack<Integer> st = new Stack<>();

        for (String token : s) {
            if (isOperator(token)) {
                int val2 = st.pop();
                int val1 = st.pop();
                int result = performOperation(val1, val2, token.charAt(0));
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%");
    }

    public static int performOperation(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }

    public static void main(String[] args) {
        String[] s = { "2", "3", "1", "*", "+", "9", "-" };
        int result = evaluatePostfix(s);
        System.out.println("Evaluated result: " + result); // Output: -4
    }
}
