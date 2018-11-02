package Lists;

import Lists.LinkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Before
    public void setUp() throws Exception {
        LinkedList<Integer> Linkedlist = new LinkedList<Integer>();
    }

    @Test
    public void add() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(100);
        assertEquals(linkedList.getHead().getData(), 100);
        linkedList.addLast(150);
        assertEquals(linkedList.getHead().getNext().getData(), 150);
    }


    @Test
    public void removeFirst() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1000);
        linkedList.add(20);
        linkedList.removeFirst();
        assertEquals(linkedList.getHead().getData(), 1000);
    }

    @Test
    public void removeLast() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1000);
        linkedList.add(20);
        linkedList.removeLast();
        assertEquals(linkedList.getHead().getNext(), null);
    }

}