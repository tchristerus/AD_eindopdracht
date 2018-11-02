package Lists.BinarySearchTree;

import models.Lego;
import org.junit.Before;
import org.junit.Test;
import utils.ArrayGrabber;
import utils.DatasetParser;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    private ArrayList<Lego> items;
    private ArrayList<Integer> itemNumbers;
    private BinarySearchTree<Integer> binarySearchTree;

    @Before
    public void setUp() throws Exception {
        items = DatasetParser.parseDataSet("dataset.csv");
        itemNumbers = ArrayGrabber.getItemNumbers(items);
        Comparator<Integer> comparator = Comparator.naturalOrder();
        binarySearchTree = new BinarySearchTree<>(comparator);
    }

    @Test
    public void insert() {
        for(Integer i : itemNumbers){
            binarySearchTree.insert(i);
        }

        assertEquals(binarySearchTree.size(), 5717);
    }

    @Test
    public void remove() {
        binarySearchTree.insert(8);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        binarySearchTree.insert(7);
        binarySearchTree.insert(13);

        binarySearchTree.remove(8);
        assertEquals(binarySearchTree.size(), 6);
    }

    @Test
    public void contains() {
        binarySearchTree.insert(8);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        binarySearchTree.insert(7);
        binarySearchTree.insert(13);
        assertEquals(binarySearchTree.contains(1), true);
        assertEquals(binarySearchTree.contains(70), false);
    }

    @Test
    public void size() {
        for(Integer i : itemNumbers){
            binarySearchTree.insert(i);
        }
        assertEquals(binarySearchTree.size(), 5717);
    }
}