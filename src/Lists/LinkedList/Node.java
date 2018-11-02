package Lists.LinkedList;

/**
 * @Author INF1F2
 */

public class Node<E> {

    private E data;
    private Node next;

    public Node (E data, Node next){
        this.data = data;
        this.next = next;
    }

    public E getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node node){
        this.next = node;
    }
}
