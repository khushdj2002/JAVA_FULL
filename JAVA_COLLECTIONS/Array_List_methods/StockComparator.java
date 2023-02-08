package JAVA_COLLECTIONS.Array_List_methods;

import java.util.*;

class StockComparator implements Comparator<Nerd_Part1> {
  
    // override the compare() method
    public int compare(Nerd_Part1 s1, Nerd_Part1 s2)
    {
        if (s1.total == s2.total)
            return 0;
        else if (s1.total > s2.total)
            return 1;
        else
            return -1;
    }
}
