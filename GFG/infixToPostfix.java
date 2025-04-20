package GFG;

import java.util.*;

class Solution {
    public static String infixToPostfix(String s) {
        // code here

        int i = 0;
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        while (i < s.length()) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() == '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == ')') {
                    st.pop();
                }
                // while (!st.isEmpty() && st.peek() != '(') {
                // ans.append(st.pop());
                // }
                // if (!st.isEmpty() && st.peek() == '(') {
                // st.pop();
                // }
            } else {
                while (!st.isEmpty() && precendence(ch) <= precendence(st.peek())) {
                    ans.append(st.pop());
                }

                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();

    }

    public static int precendence(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return -1;
    }

}
