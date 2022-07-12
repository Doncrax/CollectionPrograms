import java.util.ArrayList;
import java.util.List;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        List<String> lis1 = new ArrayList<>(6);
        lis1.add("Red");
        lis1.add("Green");
        lis1.add("Blue");
        lis1.add("Orange");
        lis1.add("Black");

        System.out.println(lis1);
        ((ArrayList<String>) lis1).ensureCapacity(10);
        lis1.add("Blue");
        lis1.add("Orange");
        lis1.add("Black");
        lis1.add("Blue");
        lis1.add("Orange");
        lis1.add("Black");
        System.out.println(lis1);
    }
}
