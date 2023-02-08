package JAVA_COLLECTIONS;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("abcd");
        li.add("abcd");
        li.add("abcd");
        li.add("abcd");
        li.add("abcd");
        Iterator itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}