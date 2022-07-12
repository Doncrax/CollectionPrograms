import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElementInArray {
    public static void main(String[] args) {
        //Create an Array List of Colors
        List<String> lis = new ArrayList<>();

        //Add 5 different colors
        lis.add("Red");
        lis.add("Green");
        lis.add("Blue");
        lis.add("White");
        lis.add("Black");

        //Print lis before reverse
        System.out.println(lis);
        //Reverse a List using Collections Method reverse
        Collections.reverse(lis);

        //Print lis after reverse
        System.out.println(lis);
    }
}
