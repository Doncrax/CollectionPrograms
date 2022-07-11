import java.util.ArrayList;
import java.util.List;

public class RetrieveAnElementFromList {
    public static void main(String[] args) {
        //Create an Array List of Colors
        List<String> lis = new ArrayList<>();

        //Add 5 different colors
        lis.add("Red");
        lis.add("Green");
        lis.add("Blue");
        lis.add("White");
        lis.add("Black");

        //Print the initial ArrayList
        System.out.println(lis);

        //Now to get an element from a specified index
        System.out.println(lis.get(2)); //Third Element

        System.out.println(lis.get(0)); //First Element

        System.out.println(lis.get(4)); //5th Element

    }
}


