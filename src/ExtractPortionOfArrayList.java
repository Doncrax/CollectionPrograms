import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractPortionOfArrayList {
    public static void main(String[] args) {
        //Create an Array List of Colors
        List<String> lis = new ArrayList<>();

        //Add 5 different colors
        lis.add("Red");
        lis.add("Green");
        lis.add("Blue");
        lis.add("White");
        lis.add("Black");

        //Print list
        System.out.println(lis);

        //Capture Portion of List from Index 2, 4
        System.out.println(lis.subList(2, 5));

        //Below code is to get index of target sublist in the Given Source List
        List<String> newLis = new ArrayList<>();

        newLis = lis.subList(2, 5);

        System.out.println(Collections.indexOfSubList(lis, newLis));
    }
}
