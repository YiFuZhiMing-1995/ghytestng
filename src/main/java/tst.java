import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class tst {
    static int a = 1;
    public static void main(String[] args) throws FileNotFoundException {
        Hashtable h = new Hashtable();
        HashMap<String, String>  hp = new HashMap<>();
        HashSet<String> se = new HashSet<>();
        String ss = "aaa";
        StringBuffer s =new StringBuffer(ss);
        StringBuilder aa = new StringBuilder(ss);
        se.add("aaa");
        se.add("aaa");
        hp.put("aa","aa");
        int dividend = 10;
        int divisor = 0;
        File file = new File("example.txt");
        FileReader reader = new FileReader(file);
    }

}
