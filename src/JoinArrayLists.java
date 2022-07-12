import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
    public static void main(String[] args) {

        List<String> lis1 = new ArrayList<>();
        lis1.add("Red");
        lis1.add("Green");
        lis1.add("Blue");
        lis1.add("Orange");
        lis1.add("Black");

        System.out.println(lis1);

        List<String> lis2 = new ArrayList<>();
        lis2.add("Red");
        lis2.add("Green");
        lis2.add("Blue");
        lis2.add("White");
        lis2.add("Black");

        System.out.println(lis2);

        //This will concat lis2 to lis1
        System.out.println(lis1.addAll(lis2));

        //print lis1 with lis2 values
        System.out.println(lis1);

    }
}
