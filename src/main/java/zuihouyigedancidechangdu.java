public class zuihouyigedancidechangdu {
    public static void main(String[] args) {
        String str = "aaa";
        int a = str.charAt(0);

        System.out.println(lengthOfLastWord(str));
    }
    public static  int lengthOfLastWord(String s) {
        int l = s.length();
        String low = s.toLowerCase();
        int index = 0;
        if(s.charAt(l-1)!=32){
            for (int i = l-1; i >= 0; i--) {
                index = i+1;
                char c = s.charAt(i);
                if(s.charAt(i)==32){
                    break;
                }
                return l;
            }
        }else {
            for (int i = l-1; i >=0; i--) {
                if(s.charAt(i)!=32){
                    for (int j = i; j >= 0; j--) {
                        char c = s.charAt(j);
                        if(s.charAt(j)==32){
                            return i - j;
                        }
                    }
                    return i+1;
                }
            }
        }
        return (l-index);
    }
}
