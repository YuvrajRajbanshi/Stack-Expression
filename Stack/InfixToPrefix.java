package Stack;

import java.util.Stack;

public class InfixToPrefix {

    // Function to return precedence of operators
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to reverse a string and also swap ( with )
    public static String reverseExpression(String expr) {
        StringBuilder result = new StringBuilder();
        for (int i = expr.length() - 1; i >= 0; i--) {
            char ch = expr.charAt(i);
            if (ch == '(')
                result.append(')');
            else if (ch == ')')
                result.append('(');
            else
                result.append(ch);
        }
        return result.toString();
    }

    // Convert infix to postfix (used internally for prefix)
    public static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (Character.isLetterOrDigit(cur)) {
                ans.append(cur);
            } else if (cur == '(') {
                stack.push(cur);
            } else if (cur == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(cur) <= precedence(stack.peek())) {
                    ans.append(stack.pop());
                }
                stack.push(cur);
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }

    // Convert infix to prefix
    public static String infixToPrefix(String infix) {
        String reversedInfix = reverseExpression(infix);
        String postfix = infixToPostfix(reversedInfix);
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        String prefix = infixToPrefix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Prefix: " + prefix);
    }
}
