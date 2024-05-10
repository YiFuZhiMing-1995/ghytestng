import com.sun.xml.internal.fastinfoset.util.CharArray;

public class huiwenchuan {
    public static void main(String[] args) {
        String str = "abba";
        Boolean is = panduan(str);
        System.out.println("");
    }
    public static Boolean panduan(String str){
        if(str.length()<=1){
            return true;
        }
        int l = str.length();
        for(int i = 0 ; i < l/2; i++){
            if(str.charAt(i)!=str.charAt(l-1-i)){
                return false;
            }
        }

        return true;
    }

}
