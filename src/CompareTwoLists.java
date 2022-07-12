import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTwoLists {
    public static void main(String[] args) {
        //Create an Array List of Colors
        List<String> lis = new ArrayList<>();

        //Add 5 different colors
        lis.add("Red");
        lis.add("Green");
        lis.add("Blue");
        lis.add("White");
        lis.add("Black");

        //Print list 1
        System.out.println(lis);

        //Create another Array List
        List<String> lis2 = new ArrayList<>();

        //Add 5 different colors
        lis2.add("Black");
        lis2.add("Green");
        lis2.add("Red");
        lis2.add("Blue");


        //Print list 2
        System.out.println(lis2);

        //Compare 2 Array Lists with sorting order
        Collections.sort(lis);
        System.out.println(lis);
        Collections.sort(lis2);
        System.out.println(lis2);
        Boolean result = lis.equals(lis2);
        System.out.println(result);

        //Create another Array List and compare without order
        List<String> lis3 = new ArrayList<>();
        for(String ele : lis) {

            lis3.add((lis2.contains(ele)) ? "Yes" : "No");

        }
        System.out.println(lis3);
    }
}
