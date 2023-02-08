package JAVA_COLLECTIONS.Array_List_methods;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class Nerd_Part1_Full {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ArrayList<Nerd_Part1> an = new ArrayList<>();
        ArrayList<Nerd_Part1> ner = new ArrayList<Nerd_Part1>();
        ner.add(new Nerd_Part1(1,"Sham",225,93));
        ner.add(new Nerd_Part1(2,"Ajay",230,93));
        ner.add(new Nerd_Part1(3,"Ram",210,93));
        ner.add(new Nerd_Part1(4,"Kiran",215,93));
        Collections.sort(ner,new StockComparator());

        Iterator itr  = ner.iterator();
        while(itr.hasNext()){
            Nerd_Part1 hello = (Nerd_Part1) itr.next();
            System.out.println(hello.roll+" "+hello.name+" "+hello.total+" "+hello.avg);
        }
        
    }
}
