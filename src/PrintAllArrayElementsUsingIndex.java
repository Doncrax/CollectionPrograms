import java.util.ArrayList;
import java.util.List;

public class PrintAllArrayElementsUsingIndex {
    public static void main(String[] args) {
        List<String> lis1 = new ArrayList<>();
        lis1.add("Red");
        lis1.add("Green");
        lis1.add("Blue");
        lis1.add("Orange");
        lis1.add("Black");

        System.out.println(lis1);

        for(int i=0; i<lis1.size(); i++){
            System.out.println(lis1.get(i));
        }
    }
}
