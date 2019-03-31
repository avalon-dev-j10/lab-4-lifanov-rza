
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class ComparatorReverseSort implements Comparator {

    public ComparatorReverseSort() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        String str1 = (String) o1;
        String str2 = (String) o2;
        int result = -(str1.compareTo(str2));
        return result;
    }
    
}
