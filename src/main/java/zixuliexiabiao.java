public class zixuliexiabiao {


    public static void main(String[] args) {
        String haystack = "ssad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        int l_h = haystack.length();
        int l_n = needle.length();
        for (int i = 0; i <= l_h-l_n; i++) {
            String sub = haystack.substring(i, i+l_n);
            if(needle.equals(sub)){
                return i;
            }
        }
        return -1;
    }
}
