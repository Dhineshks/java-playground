package misc;

import java.util.*;
/**
 * Note:-
 * java.util.Arrays uses quicksort for primitive types such as int and 
 * mergesort for objects that implement Comparable or use a Comparator.
 */
public class ArraySort {
    
    public static void main(String[] args){
        String[] countries = {"India", "United States", "Malaysia", "Australia", "London"};
        Arrays.sort(countries);
        for(int i =0; i < countries.length; i++){
            System.out.println(countries[i]);
        }
    }
}
