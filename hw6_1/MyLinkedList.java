package hw6_1;

import hw5_2.*;

public class MyLinkedList<E> implements List<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private void setHead(Node<E> node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }

    }

    private void setTail(Node<E> node) {
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;
    }

    @Override
    public String toString() {
        String result = "[";

        Node<E> currentNode = head;
        for (int i = 0; i < size; i++) {
            result += currentNode.data();

            if (i < size - 1)
                result += ", ";

            currentNode = currentNode.next();
        }

        result += "]";
        return result;
    }

    @Override
    public void add(E object) {
        Node<E> newNode = new Node<E>(object);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;

        } else {
            setTail(newNode);
            size++;
        }

    }

    @Override
    public void add(int index, E object) {
        checkBounds(index, true);

        Node<E> newNode = new Node<E>(object);

        if (index == 0) {
            setHead(newNode);
        } else if (index == size) {
            setTail(newNode);
        } else {
            Node<E> currentNode = getNodeAt(index);
            Node<E> previousNode = currentNode.previous();

            previousNode.setNext(newNode);
            newNode.setPrevious(previousNode);

            currentNode.setPrevious(newNode);
            newNode.setNext(currentNode);
        }

        size++;
    }

    @Override
    public E get(int index) {
        checkBounds(index, false);

        Node<E> node = getNodeAt(index);

        return node.data();
    }

    @Override
    public E remove(int index) {
        checkBounds(index, false);

        if (size == 1) {
            Node<E> nodeToRemove = head;
            head = null;
            tail = null;

            size--;
            return nodeToRemove.data();
        } else if (index == 0) {
            Node<E> nodeToRemove = head;
            head = head.next();
            head.setPrevious(null);

            size--;
            return nodeToRemove.data();
        } else if (index == size - 1) {
            Node<E> nodeToRemove = tail;
            tail = tail.previous();
            tail.setNext(null);

            size--;
            return nodeToRemove.data();
        } else {
            Node<E> nodeToRemove = getNodeAt(index);

            Node<E> previousNode = nodeToRemove.previous();
            Node<E> nextNode = nodeToRemove.next();

            previousNode.setNext(nextNode);
            nextNode.setPrevious(previousNode);

            size--;
            return nodeToRemove.data();
        }
    }

    @Override
    public void removeAll() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private Node<E> getNodeAt(int index) {
        Node<E> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next();
        }
        return currentNode;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void checkBounds(int index, boolean inclusive) {
        if (!isWithinBounds(index, inclusive)) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
    }

    private boolean isWithinBounds(int index, boolean inclusive) {
        if (inclusive) {
            return index >= 0 && index <= size;
        } else {
            return index >= 0 && index < size;
        }
    }
}
