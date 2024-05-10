import java.util.*;

class youxiaokuohao {
    public static void main(String[] args) {
        String str = "{（[（）]）}";
        System.out.println(isValid(str));
    }
    public  static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(')');
            }else if(s.charAt(i) == '{'){
                stack.push('}');
            }else if(s.charAt(i) == '['){
                stack.push(']');
            }else if(stack.empty() || stack.pop() != s.charAt(i) ){


            }
        }
        if(stack.empty())
            return true;
        return false;
    }
}