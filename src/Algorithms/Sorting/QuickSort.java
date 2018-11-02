package Algorithms.Sorting;

import java.util.Comparator;
import java.util.List;

public class QuickSort {

    /***
     *
     * @param list
     * @param comparator
     * @param low
     * @param high
     * @param <E>
     * @return A ascending sorted list
     */
    public static <T> List<T> sort(List<T> list, Comparator<T> comparator, int low, int high) {

        int i = low, j = high;

        T pivot = list.get(low + (high-low)/2);

        while (i <= j) {

            while (comparator.compare(list.get(i), pivot) == -1) {
                i++;
            }

            while (comparator.compare(list.get(j), pivot) == 1) {

                j--;
            }

            if (i <= j) {
                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j) {
            sort(list, comparator, low, j);
        }
        if (i < high) {
            sort(list, comparator, i, high);
        }
        return list;
    }


}
