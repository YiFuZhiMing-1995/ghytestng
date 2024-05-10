import java.util.Locale;

public class yanzhenghuiwenchuan {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String str = s.toUpperCase();
        int l = str.length();
        int left = 0;
        int right = l-1;
        while (left<right){
            char c1 = str.charAt(left);
            char c2 = str.charAt(right);
            int num1 = c1;
            int num2 = c2;
            if(!panduan(num1)){
                left++;
                continue;
            }else if(!panduan(num2)){
                right--;
                continue;
            }else if(num1==num2){
                left++;
                right--;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
    public static boolean panduan(int num){
        if((num>=48&num<=57)||(num>=65&num<=90)){
            return true;
        }
        return false;
    }

}
