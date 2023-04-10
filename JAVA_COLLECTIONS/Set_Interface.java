package JAVA_COLLECTIONS;

import java.util.*;

// Set is implemented by HashSet, LinkedHashSet, TreeSet
// We can store at most 1 null value in Set.
public class Set_Interface {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> ls= new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        SortedSet<Integer> ss = new TreeSet<>();
//        Sorted ser will add in increasing order of input
        ls.add("Ravi");
        ls.add("Vijay");
        ls.add("Vijay");
        ls.add("Ajay");
        ts.add("Ravi");
        ts.add("Vijay");
        ts.add("Vijay");
        ts.add("Ajay");

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
        Iterator<String> itr1 = ls.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
