import java.util.ArrayList;
import java.util.List;

public class CloneArrayListToAnother {
    public static void main(String[] args) {
        List<String> lis1 = new ArrayList<>();
        lis1.add("Red");
        lis1.add("Green");
        lis1.add("Blue");
        lis1.add("Orange");
        lis1.add("Black");

        System.out.println(lis1);

        ArrayList<String> lis2 = (ArrayList<String>) ((ArrayList<String>) lis1).clone();
        System.out.println(lis2);
    }
}
