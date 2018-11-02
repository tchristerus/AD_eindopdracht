package Lists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Before
    public void setUp() throws Exception {
        Stack<Integer> StackList = new Stack<Integer>();
    }

    @Test
    public void isEmpty() {
        Stack<Integer> StackList = new Stack<Integer>();
        assertEquals(StackList.isEmpty(), true);
    }

    @Test
    public void size() {
        Stack<Integer> StackList = new Stack<Integer>();
        assertEquals(StackList.size(), 0);
        StackList.push(100);
        assertEquals(StackList.size(), 1);
    }

    @Test
    public void push() {
        Stack<Integer> StackList = new Stack<Integer>();
        assertEquals(StackList.peek(), null);
        Integer obj = 100;
        StackList.push(obj);
        assertEquals(StackList.peek(), obj);
    }

    @Test
    public void pop() {
        Stack<Integer> StackList = new Stack<Integer>();
        Integer obj = 100;
        StackList.push(obj);
        assertEquals(StackList.peek(), obj);
        StackList.pop();
        assertEquals(StackList.peek(), null);
    }

    @Test
    public void peek() {
        Stack<Integer> StackList = new Stack<Integer>();
        Integer obj = 100;
        StackList.push(obj);
        assertEquals(StackList.peek(), obj);
    }
}