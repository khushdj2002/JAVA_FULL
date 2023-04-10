package JAVA_COLLECTIONS.Array_List_methods;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ll  = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ls.add(j);
            }
            ll.add(ls);
            System.out.println(ls);
            ls.spliterator();
            System.out.println(ll);
        }


    }
}
