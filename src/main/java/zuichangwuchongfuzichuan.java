import java.util.HashSet;

public class zuichangwuchongfuzichuan {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        int l = s.length();
        HashSet set = new HashSet();
        int max_l = 0;
        for (int i = 0; i < l ; i++) {
            for (int j = i; j < l; j++) {
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    if(max_l<set.size()){
                        max_l = set.size();
                    }
                }else {
                    set.clear();
                    break;
                }
            }
        }
        return max_l;
    }
}
