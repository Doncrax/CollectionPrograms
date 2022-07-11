import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {

        List<String> lis = new ArrayList<>();
        lis.add("Red");
        lis.add("Green");
        lis.add("Yellow");
        lis.add("White");
        lis.add("Black");

        //Print Initial Array
        System.out.println(lis);

        //Sort Array - Can use any one of the below
        //Collections.sort(lis);
        lis.sort(Comparator.naturalOrder());

        System.out.println(lis);

        //if you want in reverse order
        //Collections.sort(lis, Comparator.reverseOrder());
        lis.sort(Comparator.reverseOrder());

        //Print Final Array
        System.out.println(lis);
    }
}
