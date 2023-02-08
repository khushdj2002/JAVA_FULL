package JAVA_COLLECTIONS;

import java.util.Iterator;
import java.util.Vector;

public class Vectorrr {
    public static void main(String[] args) {
        Vector<String> v =new Vector<>();
        v.add("ayush");
        v.add("ayush");
        v.add("ayush");
        v.add("ayush");
        v.add("ayush");
        v.add("ayush");
        Iterator itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
