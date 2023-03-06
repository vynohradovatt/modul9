package task4;

public interface MyStackInterface<E> {
    public E push(Object value);
    public boolean remove(int index);
    public void clear();
    public int size();
    public E peek();
    public E pop();
}
