package Lists;

import java.util.*;

public class Queue<T> {

    //Queue Size
    private int n;
    //Item in front of queue
    private Node first;
    //Last Item in queue
    private Node last;

    private class Node {
        private T item;
        private Node next;
    }

    // Constructor
    public Queue() {
        n = 0;
        first = null;
        last = null;
    }


    public boolean isEmpty() {
        return (first == null);
    }

    //Size of the queue
    public int size() {
        return n;
    }

    //Add item to Queue
    public void enqueue(T item) {
        Node old = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            old.next = last;
        }

        n++;
    }


    //Remove item from Queue
    public T dequeue() {
        T item = first.item;
        first = first.next;

        n--;

        if (isEmpty()) {
            last = null;
        }

        return item;
    }

    //Check first item in Queue
    public T peek() {
        return (first.item != null) ? first.item : null;
    }
}







