
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class SortList implements Sort {

    @Override
    public void sort(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                boolean result = array[j-1].equals(array[j]); 
                if (!(result)) {
                Object o = array[j];
                array[j] = array[j-1];
                array[j-1] = o;
                }
            }
        }
    }

    @Override
    public void sort(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                int result = array[j-1].compareTo(array[j]);
                if (result > 0) {
                Comparable comparable = array[j];
                array[j] = array[j-1];
                array[j-1] = comparable;
                }
            }
        }
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                int result = comparator.compare(array[j-1], array[j]);
                if (result > 0) {
                Object o = array[j];
                array[j] = array[j-1];
                array[j-1] = o;
                }
            }
        }
    }
}
            
    
