package Lists.DoublyLinkedList;

/**
 * @Author INF1F2
 */
public class DoublyLinkedList<E> {

    private Node head;
    private Node tail;
    private Iterator<E> iterator;
    private int size = 0;

    public int getSize(){
        return this.size;
    }

    public void addFirst(E data){
        if(head == null) { // no head created yet, adding new
            this.head = new Node(data, null, null);
            this.tail = this.head;
            this.iterator = new Iterator<E>(this);
            System.out.println("Created first head with data: " + data);
        }else{ // Pushing new head to the head and making the current head second
            Node tmpHead = head;
            Node newNode = new Node(data, null, tmpHead);
            tmpHead.setPrev(newNode);
            this.head = newNode;
            System.out.println("Updated existsing head with data: " + data);

        }
        size++;
    }

    public void addLast(E data){
        if(head == null) {
            addFirst(data);
        }else{
            Node newNode = new Node(data, tail, null);
            Node tmpTail = tail;
            tmpTail.setNext(newNode);
            tail = newNode;
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
                tmpHead.getNext().setPrev(null);
                this.head = tmpNext;
                System.out.println("Removed first item");
            }else{ // only 1 item, removing it
                this.head = null;
                this.tail = null;
            }
            size--;
        }
    }

    public void removeLast(){
        if(tail == null){
            System.out.println("Cannot remove last item, list empty");
        }else{
            if(tail.getPrevious() != null) {// more then 1 items
                Node tmpPrevious = tail.getPrevious();
                tmpPrevious.setNext(null);
                tail = tmpPrevious;
                System.out.println("Removed last item");
            }else {
                this.head = null;
                this.tail = null;
            }
            size--;
        }
    }

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }

    public Iterator getIterator(){
        return this.iterator;
    }
}
