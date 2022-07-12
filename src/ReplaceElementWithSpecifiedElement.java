import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReplaceElementWithSpecifiedElement {
    public static void main(String[] args) {
        List<String> lis1 = new ArrayList<>();
        lis1.add("Red");
        lis1.add("Green");
        lis1.add("Blue");
        lis1.add("Orange");
        lis1.add("Black");

        System.out.println(lis1);

        lis1.set(2, "White");

        System.out.println(lis1);
        Iterator<String> it = lis1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String ele : lis1){
            System.out.println(ele);
        }

        for(int i=0; i<lis1.size(); i++){
            System.out.println(lis1.get(i));
        }
    }
}
