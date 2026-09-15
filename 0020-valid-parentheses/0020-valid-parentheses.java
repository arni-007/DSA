class Solution {
    public boolean isValid(String s) {
        int length = s.length();

        char[] stack = new char[length];
        int top = -1;

        for (int i = 0; i < length; i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                top++;
                stack[top] = s.charAt(i);
            }

            else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {

                if (top == -1) {
                    return false;
                }

                if ((s.charAt(i) == ')' && stack[top] == '(') ||
                    (s.charAt(i) == ']' && stack[top] == '[') ||
                    (s.charAt(i) == '}' && stack[top] == '{')) {
                    top--;
                }
                else {
                    return false;
                }
            }
        }

        return top == -1;
    }
}