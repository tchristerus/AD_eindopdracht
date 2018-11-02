package Algorithms.Sorting;

import org.junit.Before;
import org.junit.Test;
import utils.ArrayGrabber;
import utils.DatasetParser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InsertionSortTest {
    ArrayList<Integer> items;

    @Before
    public void setUp() throws Exception {
        items = ArrayGrabber.getItemNumbers(DatasetParser.parseDataSet("dataset.csv"));
    }

    @Test
    public void testSort() {
        Comparator<Integer> comparator = Comparator.naturalOrder();
        isSorted(InsertionSort.sort(items, comparator));

    }

    /**
     * @param list
     *
     */
    private void isSorted(List<Integer> list) {
        assertThat(list.get(5), is(10));
        assertThat(list.get(100), is(614));
        assertThat(list.get(500), is(2962));
        assertThat(list.get(1000), is(4047));
        assertThat(list.get(list.size()-1), is(6031641));
    }

}