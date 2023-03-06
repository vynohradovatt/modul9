package task2;

public interface MyLinkedListInterface<E> {

    public boolean add(E value);
    public void remove(int index);
    public void clear();
    int size();
    public E get(int index);
}
