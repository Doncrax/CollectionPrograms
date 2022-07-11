import java.util.ArrayList;
import java.util.List;

public class AddElementToFirstPositionInList {
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

        //Now add new Color to the first position i.e., 0th index or before Red.
        lis.add(0, "Pink");

        //Print the final Array
        System.out.println(lis);

    }
}
