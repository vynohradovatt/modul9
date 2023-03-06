package task2;

public class MyLinkedList<E> implements MyLinkedListInterface<E> {

    private Node<E> firstElem;
    private Node<E> lastElem;
    private int size = 0;
    private class Node<E> {

        private E item;
        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(E item) {
            this.item = item;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }
    }

    public boolean add(E value) {
        Node<E> node = new Node<E>((E)value);
        if (firstElem == null) {
            firstElem = node;
            lastElem = node;
        } else {
            node.prevElement = lastElem;
            lastElem.nextElement = node;
            lastElem = node;
        }
        size++;
        return true;
    }
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = firstElem;
        for (int i = 0; i < index; i++) {
            current = current.nextElement;
        }
        if (current.prevElement == null) {
            firstElem = current.nextElement;
        } else {
            current.prevElement.nextElement = current.nextElement;
        }
        if (current.nextElement == null) {
            lastElem = current.prevElement;
        } else {
            current.nextElement.prevElement = current.prevElement;
        }
        size--;
    }

    @Override
    public void clear() {
        lastElem = null;
        firstElem = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = firstElem;
        for (int i = 0; i < index; i++) {
            current = current.nextElement;
        }
        return current.item;
    }
}
