package Lists.LinkedList;

import Lists.LinkedList.*;

/**
 * @Author INF2F1
 */
public class Iterator<E> {

    private LinkedList<E> linkedList;
    private Lists.LinkedList.Node current;

    public Iterator(LinkedList linkedList){
        this.linkedList = linkedList;
        this.current = linkedList.getHead();
    }

    public boolean hasNext(){
        return (current.getNext() != null);
    }


    public Node getNext(){
        Node returnNode = current.getNext();
        this.current = current.getNext();
        return returnNode;
    }


    public Node getNode(){
        return this.current;
    }
}
