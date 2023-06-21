package misc;

import java.util.*;

public class ConvertCollectionToSynchronizedCollection {
    public static void main(String[] args) {
        List<String> syncList = Collections.synchronizedList(new ArrayList<String>());

        syncList.add("one");
        syncList.add("two");
        syncList.add("three");
        syncList.add("four");

        synchronized(syncList) {
            Iterator<String> iterator = syncList.iterator();
            while(iterator.hasNext()) {
                System.out.println("Item: " + iterator.next());
            }
        }
    }
}
