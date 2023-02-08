package JAVA_COLLECTIONS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Deque_Interface
 * ArrayDeque
 */
public class Deque_Interface {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();
        deq.add("Gautham");
        deq.add("karan");
        deq.add("Ajay");
        Iterator itr = deq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}