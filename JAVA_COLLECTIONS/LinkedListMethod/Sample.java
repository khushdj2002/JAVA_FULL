package JAVA_COLLECTIONS.LinkedListMethod;

import java.util.Collections;
import java.util.LinkedList;

public class Sample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.push(5);
        ll.push(6);
        ll.push(7);

        Collections.sort(ll);

        System.out.println(ll);
    }
}
