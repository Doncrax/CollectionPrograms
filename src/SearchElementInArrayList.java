import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayList {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        lis.add("Red");
        lis.add("Green");
        lis.add("Yellow");
        lis.add("White");
        lis.add("Black");

        //Print Initial Array
        System.out.println(lis);

        //Search for Yellow in List
        System.out.println(lis.contains("Yellow"));
        System.out.println(lis.contains("Blue"));

        if(lis.contains("Yellow")){
            System.out.println("Found the Element");
        } else {
            System.out.println("Element not found");
        }
    }
}
