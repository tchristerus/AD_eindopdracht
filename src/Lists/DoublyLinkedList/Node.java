package Lists.DoublyLinkedList;

/**
 * @Author INF1F2
 */

public class Node<E> {

    private E data;
    private Node prev;
    private Node next;

    public Node (E data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public E getData(){
        return this.data;
    }

    public Node getPrevious(){
        return this.prev;
    }

    public Node getNext(){
        return this.next;
    }

    public void setPrev(Node node){
        this.prev = node;
    }

    public void setNext(Node node){
        this.next = node;
    }
}
