package task2;

public interface MyLinkedListInterface<E> {

    boolean add(E value);
    void remove(int index);
    void clear();
    int size();
    E get(int index);
}
