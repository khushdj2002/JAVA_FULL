package JAVA_COLLECTIONS;

import java.util.Iterator;
import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Stack<String> s =new Stack<>();
        s.push("abcdefgh");
        s.push("abcdefgh");
        s.push("abcdefgh");
        s.push("abcdefgh");
        s.push("abcdefgh");
        s.pop();
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
