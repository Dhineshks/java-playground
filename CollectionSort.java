package misc;
import java.util.*;

public class CollectionSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("India");
        list.add("United States");
        list.add("Malaysia");
        list.add("Australia");
        list.add("London");

        Collections.sort(list);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
