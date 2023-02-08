package JAVA_COLLECTIONS;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * SortedSetInterface
 * Here elements are ordered in increasing order 
 * 
 */
public class SortedSetInterface {
    public static void main(String[] args) {
        TreeSet<String> ts  = new TreeSet<>();
        ts.add("Ravi");
        ts.add("Vijay");
        ts.add("Ravi");
        ts.add("Ajay");
        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}