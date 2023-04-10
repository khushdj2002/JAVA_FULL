package JAVA_COLLECTIONS.Set;

import java.util.*;
class HashSet {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        java.util.HashSet<String> set=new java.util.HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        System.out.println(set);
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}