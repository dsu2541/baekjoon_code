package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class B_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cnt; i++) {
            String input = sc.nextLine();
            System.out.println(isValidParentheses(input) ? "YES" : "NO");
        }
    }

    //스택 이용
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}