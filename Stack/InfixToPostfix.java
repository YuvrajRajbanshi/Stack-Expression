package Stack;

import java.util.Stack;

public class InfixToPostfix {

    public static String postFix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(cur)) {
                ans.append(cur);
            }

            // Opening bracket
            else if (cur == '(') {
                st.push(cur);
            }

            // Closing bracket
            else if (cur == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            }

            // Operator
            else {
                while (!st.isEmpty() && priority(cur) <= priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(cur);
            }
        }

        // Remaining operators
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    public static int priority(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";
        System.out.println("Postfix: " + postFix(s));
    }
}
