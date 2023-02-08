package JAVA_COLLECTIONS;

import java.util.*;

class Array_List{
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
        System.out.println(list);;
        //Traversing list through Iterator  
        Iterator itr = list.iterator();
        // Iterator itr=list.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }
    }
}