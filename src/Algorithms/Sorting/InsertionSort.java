package Algorithms.Sorting;

import java.util.Comparator;
import java.util.List;

public class InsertionSort {

    public static <T> List<T> sort(List<T> list, Comparator<T> comparator) {
        for (int i=1; i < list.size(); i++) {
            T currentItem = list.get(i);
            int j = i;
            while (j > 0) {
                T itemInfront = list.get(j-1);
                if (comparator.compare(currentItem, itemInfront) >= 0)
                    break;
                list.set(j, itemInfront);
                j--;
            }
            list.set(j, currentItem);
        }
        return list;
    }
}