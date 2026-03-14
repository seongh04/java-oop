package hw6_1;

public class Node<E> {
    private E data;
    private Node<E> next;
    private Node<E> previous;

    public Node(E data) {
        this.data = data;
    }

    public Node<E> next() {
        return next;
    }

    public Node<E> previous() {
        return previous;
    }

    public E data() {
        return data;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

}
