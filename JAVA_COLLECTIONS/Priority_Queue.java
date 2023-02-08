package JAVA_COLLECTIONS;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Amit sharma1");
        pq.add("Amit sharma2");
        pq.add("Amit sharma3");
        pq.add("Amit sharma4");
        pq.add("Amit sharma5");
        pq.add("Amit sharma6");
        pq.add("Amit sharma7");
        pq.add("Amit sharma8");
        System.out.println("head"+pq.element());
        System.out.println("head"+pq.peek());
        System.out.println("Iterating the queue elements");
        Iterator itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        pq.remove();
        pq.poll();
        System.out.println("After removuing two elements");
        Iterator itr2  = pq.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        // Iterator itr3  = pq.iterator();
        // while(itr3.hasNext()){
        //     System.out.println(itr3.next());
        // }
    }
}
