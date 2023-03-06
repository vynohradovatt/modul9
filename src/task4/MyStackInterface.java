package task4;

public interface MyStackInterface<E> {
    E push(E value);
    boolean remove(int index);
    void clear();
    int size();
    E peek();
    E pop();
}
