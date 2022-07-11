import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        lis.add("Red");
        lis.add("Green");
        lis.add("Orange");
        lis.add("White");
        lis.add("Black");

        Iterator<String> it = lis.iterator();

        while(it.hasNext()){
            System.out.println("Elements in List: " +it.next());
        }

        //Second Method
        for(String ele : lis){
            System.out.println(ele);
        }

    }
}
