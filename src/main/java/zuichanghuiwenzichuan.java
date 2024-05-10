public class zuichanghuiwenzichuan {
    public static void main(String[] args) {
        String str = "aacabdkacaa";
        System.out.println(longestPalindrome(str));
    }
    public  static String longestPalindrome(String s) {
        int l = s.length();
        int max_l = 0;
        String max_str = "";
        for (int i = 0; i < l; i++) {
            for (int j = l-1; j >= i; j--) {
                String sub = s.substring(i,j+1);
                if(huiwenchuan(sub)){
                    int l_sub = sub.length();
                    if(max_l<l_sub){
                        max_l = l_sub;
                        max_str = sub;
                    }
                    if(max_l >= l-i){
                        return max_str;
                    }
                }
            }
        }
        return max_str;
    }
    public static boolean huiwenchuan(String str){
        int l = str.length();
        for (int i = 0; i < l/2; i++) {
            if(str.charAt(i)!=str.charAt(l-i-1)){
                return false;
            }
        }
        return true;
    }
}

