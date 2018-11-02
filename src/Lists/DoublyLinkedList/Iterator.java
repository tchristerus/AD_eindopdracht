package Lists.DoublyLinkedList;

/**
 * @Author INF2F1
 */
public class Iterator<E> {

    private DoublyLinkedList<E> doublyLinkedList;
    private Node current;

    public Iterator(DoublyLinkedList doublyLinkedList){
        this.doublyLinkedList = doublyLinkedList;
        this.current = doublyLinkedList.getHead();
    }

    public boolean hasNext(){
        return (current.getNext() != null);
    }

    public boolean hasPrev(){
        return (current.getPrevious() != null);
    }

    public Node getNext(){
        Node returnNode = current.getNext();
        this.current = current.getNext();
        return returnNode;
    }

    public Node getPrevious(){
        Node returnNode = current.getPrevious();
        this.current = current.getPrevious();
        return returnNode;
    }

    public Node getNode(){
        return this.current;
    }
}
