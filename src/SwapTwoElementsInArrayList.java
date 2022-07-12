import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElementsInArrayList {
    public static void main(String[] args) {
        //Create an Array List of Colors
        List<String> lis = new ArrayList<>();

        //Add 5 different colors
        lis.add("Red");
        lis.add("Green");
        lis.add("Blue");
        lis.add("White");
        lis.add("Black");

        //Print list 1
        System.out.println(lis);

        //Swap 2 Elements in the array ex: swap Blue and Red
        Collections.swap(lis, 0, 2);
        //Print List after swap
        System.out.println(lis);

        //Swap without using Collections library
        for(int i =0; i<lis.size(); i++){
            for (int j=0; j<lis.size(); j++){
                if(i == 0 && j == 2){
                   String temp = lis.get(i);
                   String temp2 = lis.get(j);
                   lis.set(0, temp2);
                   lis.set(2, temp);
                }
            }
        }
        System.out.println(lis);
    }
}
