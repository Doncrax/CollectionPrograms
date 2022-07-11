import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleElementsInArray {
    public static void main(String[] args) {
        List<String> lis_1 = new ArrayList<>();
        lis_1.add("Red");
        lis_1.add("Green");
        lis_1.add("Yellow");
        lis_1.add("White");
        lis_1.add("Black");
        System.out.println(lis_1);

        //Shuffle Elements
        Collections.shuffle(lis_1);
        //Collections.shuffle(lis_1, new Random());

        System.out.println(lis_1);
    }
}
