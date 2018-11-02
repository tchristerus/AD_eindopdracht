package Lists;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import Lists.DoublyLinkedList.DoublyLinkedList;
import Lists.DoublyLinkedList.Iterator;
import org.junit.Before;
import org.junit.Test;
import utils.ArrayGrabber;
import utils.DatasetParser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DoublyLinkedListTest {
    @Test
    public void size() throws Exception {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertEquals(list.getSize(), 0);
        list.addFirst(1);
        assertEquals(list.getSize(), 1);
    }


    @Test
    public void addFirst() throws Exception {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(2);
        assertEquals(list.getHead().getData(), 2);
        list.addFirst(1);
        assertEquals(list.getHead().getData(), 1);
    }

    @Test
    public void addLast() throws Exception {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(2);
        assertEquals(list.getTail().getData(), 2);
        list.addLast(1);
        assertEquals(list.getTail().getData(), 1);
    }

    @Test
    public void iterateForward() throws Exception {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(2);
        list.addLast(1);
        list.addLast(5);
        Iterator it = list.getIterator();

        assertEquals(it.getNext().getData(), 1);
    }

    @Test
    public void iterateBackward() throws Exception {

    }

    @Test
    public void removeFirst() throws Exception {

    }

    @Test
    public void removeLast() throws Exception {

    }

}