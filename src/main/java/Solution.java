public class Solution {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "ahbgdc";
        System.out.println(isSubsequence(str1, str2));

    }
    public static boolean isSubsequence(String s, String t) {

        if(s .length() < 1){
            return true;
        }
        int l1 = t.length();
        int l2 = s.length();
        int index = 0;
        for (int i = 0; i < l1; i++) {
            for (int j = i; j < l1; j++) {
                char c = s.charAt(index);
                    if (t.charAt(j) == c) {
                        index++;
                        if(index ==l2){
                            return true;
                        }
                        i = j;
                        break;
                }
            }
        }

        return false;
    }
}
