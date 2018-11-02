package Lists;

import java.util.*;

public class Stack<T> {

    //Stack size
    private int n;
    //First item in Stack
    private Node first;

    private class Node {
        private T item;
        private Node next;
    }

    //Constructor
    public Stack(){
        n = 0;
        first = null;
    }


    public boolean isEmpty() {
        return (first == null);
    }

    //Size of the Stack
    public int size(){
        return n;
    }

    //Put a new item on top of the Stack
    public void push(T item){
        Node old = first;
        first = new Node();
        first.item = item;
        first.next = old;

        n++;
    }

    //Remove item from top of the Stack
    public T pop()
    {
        T item = first.item;
        first = first.next;

        if (isEmpty()){
            first = null;
        }

        n--;

        return item;
    }

    //Show top item of the Stack
    public T peek()
    {
        if(isEmpty()){
            return null;
        }

        return first.item;
    }
}
