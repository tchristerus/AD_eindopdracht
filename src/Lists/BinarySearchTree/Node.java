package Lists.BinarySearchTree;

public class Node<T> {

    private Node<T> left, right;
    private T data;

    public Node(T data){
        this.data = data;
    }

    public Node(T data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setLeft(Node<T> left){
        this.left = left;
    }

    public void setRight(Node<T> right){
        this.right = right;
    }

    public Node<T> getLeft(){
        return this.left;
    }

    public Node<T> getRight(){
        return this.right;
    }

    public T getData(){
        return this.data;
    }
}
