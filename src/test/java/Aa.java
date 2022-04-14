import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aa {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>(1);
        list.add("1");
        list.add("33333");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
