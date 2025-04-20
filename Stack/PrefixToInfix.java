package Stack;

import java.util.Stack;

public class PrefixToInfix {

    public static String convert(String s) {
        Stack<String> st = new Stack<>();

        // Traverse the prefix expression from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char cur = s.charAt(i);

            // If character is operand
            if (Character.isLetterOrDigit(cur)) {
                st.push(String.valueOf(cur));
            } else {
                // It's an operator
                String op1 = st.pop();
                String op2 = st.pop();

                // Form the infix expression with parentheses
                String expr = "(" + op1 + cur + op2 + ")";
                st.push(expr);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL"; // Sample Prefix expression

        String infix = convert(prefix);
        System.out.println("Infix Expression: " + infix);
    }
}
