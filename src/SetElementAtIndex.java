import java.util.ArrayList;
import java.util.List;

public class SetElementAtIndex {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        lis.add("Red");
        lis.add("Green");
        lis.add("Yellow");
        lis.add("White");
        lis.add("Black");

        //Print Initial Array
        System.out.println(lis);

        //update specific array element with given element

        lis.set(2, "Blue");

        //Print final array
        System.out.println(lis);
    }
}
