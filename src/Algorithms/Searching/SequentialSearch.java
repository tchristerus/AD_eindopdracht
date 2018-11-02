package Algorithms.Searching;

import java.util.List;

public class SequentialSearch {

    public static <T> T find(List<T> haystack, T needle) {
        return haystack.stream().filter(e -> e.equals(needle)).findFirst().orElse(null);
    }
}
