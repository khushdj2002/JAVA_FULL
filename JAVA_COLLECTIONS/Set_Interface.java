package JAVA_COLLECTIONS;

import java.util.HashSet;
import java.util.Iterator;

// Set is implemented by HashSet, LinkedHashSet, TreeSet
public class Set_Interface {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("helo");
        hs.add("helo0");
        hs.add("helo2");
        hs.add("helo3");
        hs.add("helo");
        System.out.println(hs);
        Iterator itr  = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
