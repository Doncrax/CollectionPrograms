import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        lis.add("Red");
        lis.add("Green");
        lis.add("Yellow");
        lis.add("White");
        lis.add("Black");

        //Print Initial Array
        System.out.println(lis);

        //Remove a particular element
        lis.remove(2);

        //Print the Final Array
        System.out.println(lis);
    }
}
