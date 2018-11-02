package Lists;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class QueueTest {

    @Test
    public void isEmpty() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        assertEquals(queue.isEmpty(), true);
        queue.enqueue(3);
        assertEquals(queue.isEmpty(), false);
    }

    @Test
    public void size() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        assertEquals(queue.size(), 0);
        queue.enqueue(3);
        assertEquals(queue.size(), 1);
    }

    @Test
    public void enqueue() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        Integer obj = 3;
        queue.enqueue(obj);
        assertEquals(queue.peek(), obj);
    }

    @Test
    public void dequeue() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        Integer obj = 3;
        Integer obj2 = 4;
        queue.enqueue(obj);
        queue.enqueue(obj2);
        assertEquals(queue.peek(), obj);
        queue.dequeue();
        assertEquals(queue.peek(), obj2);
    }

    @Test
    public void peek() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(3);
        assertThat(queue.peek(), is(3));
        queue.enqueue(6);
        assertThat(queue.peek(), is(3));
    }

}