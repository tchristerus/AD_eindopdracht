package Algorithms.Sorting;

import java.util.Comparator;
import java.util.List;

public class SmartBubbleSort {

    // TODO
    public static <T> List<T> sort(List<T> list, Comparator<T> comparator) {
        boolean done = false;

        while(!done){
            boolean swap = false;
            for(int i = 0; i < list.size() -1; i++){
                if(comparator.compare(list.get(i), list.get(i+1)) == 1){
                    T tmp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, tmp);
                    swap = true;
                }
            }
            if(!swap)
                done = true;
        }
        return list;
    }
}
