package Lists.BinarySearchTree;

import java.util.Comparator;

public class BinarySearchTree<T> {

    private Node<T> root;
    private Comparator<T> comp;

    public BinarySearchTree(Comparator<T> comparator) {
        this.comp = comparator;
    }

    public void insert(T data) {
        if (this.root == null) {
            this.root = new Node<>(data);
        } else
            insert(data, this.root);
    }

    /***
     * Inserts a specific Node to the binary tree
     * @param data
     * @param currentNode
     */
    private void insert(T data, Node<T> currentNode) {
        int num = this.comp.compare(data, currentNode.getData());
        if (num < 0) {
            if (currentNode.getLeft() == null)
                currentNode.setLeft(new Node<>(data));
            else
                insert(data, currentNode.getLeft());
        } else if (num > 0) {
            if (currentNode.getRight() == null)
                currentNode.setRight(new Node<>(data));
            else
                insert(data, currentNode.getRight());
        }
    }


    public void remove(T data) {
        remove(data, this.root);
    }

    /***
     * Removes a specific Node from the tree (recursive operation)
     * @param data
     * @param currentNode
     */
    private void remove(T data, Node<T> currentNode) {
        int num = this.comp.compare(data, currentNode.getData());
        if (num > 0) { // Node is bigger, so search on right side
            if(currentNode.getRight() != null) { // There is a node on the right side
                int isNextNode = this.comp.compare(data, currentNode.getRight().getData());
                if (isNextNode == 0) { // the right node is the one we are searching
                    T highestLeft = highestLeftTree(currentNode).getData(); // Get the highest node on the left side
                    remove(highestLeft); // removing the highest node on the left side
                    currentNode.getRight().setData(highestLeft); // swapping the node we want to remove with the highest left node
                }
                else
                    remove(data, currentNode.getRight());
            }
        }else if(num < 0) { // Node is smaller, so search on left side
            if(currentNode.getLeft() != null) {
                int isNextNode = this.comp.compare(data, currentNode.getLeft().getData());
                if (isNextNode == 0)
                    currentNode.setLeft(currentNode.getLeft().getLeft());
                else
                    remove(data, currentNode.getLeft());
            }
        }else{
            // The root node needs to be removed

            if(this.root.getRight() == null && this.root.getLeft() != null) // There is only a left tree
                this.root = this.root.getLeft();
            else if(this.root.getRight() != null && this.root.getLeft() == null) // There is only a right tree
                this.root = this.root.getRight();
            else{
                // The root node has 2 children, in this case we have to replace the root with the highest value of the left tree
                T tmpData = highestLeftTree(this.root).getData();
                remove(tmpData);
                this.root.setData(tmpData);
                System.out.println("Root updated");
            }
        }
    }

    /**
     * Finds the highest node in the left tree and returns it's parent
     * @return
     */
    private Node<T> highestLeftTree(Node<T> startNode){
        Node<T> node = startNode.getLeft();
        Node<T> highest = startNode.getLeft();

        while(node.getLeft() != null || node.getRight() != null){
            if(node.getRight() != null){
                node = node.getRight();
            }else if(node.getLeft() != null){
                node = node.getLeft();
            }
            if(this.comp.compare(node.getData(), highest.getData()) > 0)
                highest = node;
        }
        return highest;
    }

    /***
     * Check if the binary tree contains a specific value
     * @param data
     * @return boolean if the value exists in the tree
     */
    public boolean contains(T data){
        return contains(data, this.root);
    }

    private boolean contains(T data, Node<T> node){
        if(node == null)
            return false;
        else if (node.getData() == data)
            return true;

        int num = this.comp.compare(data, node.getData());
        return  contains(data, (num < 0) ? node.getLeft() : node.getRight());
    }

    public int size(){
        return size(this.root);
    }


    private int size(Node<T> node){
        if(node != null)
            return(size(node.getLeft()) + 1 + size(node.getRight()));
        return 0;
    }
}