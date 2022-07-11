import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        List<String> lis_1 = new ArrayList<>();
        lis_1.add("Red");
        lis_1.add("Green");
        lis_1.add("Yellow");
        lis_1.add("White");
        lis_1.add("Black");
        System.out.println(lis_1);

        List<String> lis_2 = new ArrayList<>();
        lis_2.add("Blue");
        lis_2.add("Pink");
        lis_2.add("Burgandy");
        lis_2.add("Maroon");
        lis_2.add("Indigo");
        System.out.println(lis_2);

        //add all elements of lis_1 to lis_2
        lis_2.addAll(lis_1);
        System.out.println(lis_2);

        //Copy List 2 to List1
        //to make dest size same as source
        lis_1.addAll(lis_2);
        System.out.println(lis_1);
        Collections.copy(lis_1, lis_2);

        System.out.println(lis_1);
    }
}
