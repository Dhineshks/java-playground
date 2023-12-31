package misc;

import java.util.*;

public class ArrayListToArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        System.out.println(list);
        System.out.println("Converting array list to array: ");
        String[] item = list.toArray(new String[list.size()]);
        
        for (String s : item) {
            System.out.println(s);
        }
        System.out.println("Converitng Array to ArrayList: ");
        List<String> list2 = new ArrayList<>();
        list2 = Arrays.asList(item);
        System.out.println(list2);
    }
}