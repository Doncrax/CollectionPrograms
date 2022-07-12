import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {
    public static void main(String[] args) {
        List<String> lis1 = new ArrayList<>();
        lis1.add("Red");
        lis1.add("Green");
        lis1.add("Blue");
        lis1.add("Orange");
        lis1.add("Black");

        System.out.println(lis1);

        //To Clear an ArrayList
        //lis1.clear();
        System.out.println(lis1);

        //Can also use
        lis1.removeAll(lis1);
        System.out.println(lis1);
    }
}
