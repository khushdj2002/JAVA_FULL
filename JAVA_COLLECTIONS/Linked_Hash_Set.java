package JAVA_COLLECTIONS;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {
    public static void main(String[] args) {

//        In set duplicate elements are not allowed.
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Ravi");
        lhs.add("Vijay");
        lhs.add("Ravi");
        lhs.add("Ajay");
        lhs.add("vijay");
        Iterator itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
