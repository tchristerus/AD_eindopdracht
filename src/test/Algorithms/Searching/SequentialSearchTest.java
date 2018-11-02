package Algorithms.Searching;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;
import utils.ArrayGrabber;
import utils.DatasetParser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class SequentialSearchTest {

    private ArrayList<Integer> items;

    @Before
    public void setUp() throws Exception {
        items = ArrayGrabber.getItemNumbers(DatasetParser.parseDataSet("dataset.csv"));
    }

    @Test
    public void testSequentialSearch() {
        assertThat(SequentialSearch.find(items, 10), is(10));

    }
}