package Stack;

import java.util.Stack;

public class PostfixToInfix {

    public static String postfixToInfix(String s) {

        Stack<String> st = new Stack<>();

        int i = 0;
        while (i < s.length()) {
            char cur = s.charAt(i);
            if (Character.isLetterOrDigit(cur)) {
                st.push(String.valueOf(cur));
            } else {
                String top1 = st.pop();
                String top2 = st.pop();
                String concat = "(" + top1 + cur + top2 + ")";
                st.push(concat);
            }
            i++;
        }

        return st.pop().toString();

    }

    public static void main(String[] args) {

        // String s = "AB-DE+F*/";
        String str[] = { "2", "3", "1", "*", "+", "9", "-" };
        String s = "";
        for (int i = 0; i < str.length; i++) {
            s += str[i];
        }

        System.out.println(postfixToInfix(s));
    }
}
