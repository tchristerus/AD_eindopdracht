package Lists.LinkedList;

import Lists.LinkedList.*;

/**
 * @Author INF1F2
 */
public class LinkedList<E> {

    private Node head;
    private int size = 0;
    private Iterator<E> iterator;

    public int getSize(){
        return this.size;
    }

    public void add(E data){
        if(head == null) { // no head created yet, adding new
            this.iterator = new Iterator<E>(this);
            this.head = new Node(data, null);
            System.out.println("Created first head with data: " + data);
        }else{ // Pushing new head to the head and making the current head second
            Node tmpHead = head;
            Node newNode = new Node(data, tmpHead);
            this.head = newNode;
            System.out.println("Updated existsing head with data: " + data);

        }
        size++;
    }

    public void addLast(E data){
        if(head == null) {
            add(data);
        }else{
            Node newNode = new Node(data, null);
            Node tmp = this.head;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
            System.out.println("Updated tail with data: " + data);
            size++;
        }
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Cannot remove first item, list empty");
        }else {
            Node tmpHead = head;

            if(tmpHead.getNext() != null){ // More then 1 items in the list
                Node tmpNext = tmpHead.getNext();
                this.head = tmpNext;
                System.out.println("Removed first item");
            }else{ // only 1 item, removing it
                this.head = null;
            }
            size--;
        }
    }

    public void removeLast(){
        Node tmp = this.head;
        Node prev = this.head;
        while(tmp.getNext() != null){
            prev = tmp;
            tmp = tmp.getNext();
        }
        prev.setNext(null);
    }

    public Node getHead(){
        return this.head;
    }

    public Node getLast(){
        Node tmp = this.head;
        while(tmp.getNext() != null){
            tmp = tmp.getNext();
        }
        return tmp;
    }

    public Iterator getIterator(){
        return this.iterator;
    }

}
