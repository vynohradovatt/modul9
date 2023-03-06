package task1;

public interface MyArrayInterface<E>{
    int size();
    boolean remove(int index);
    boolean add(E e);
    void clear();
    E get(int index);
}
