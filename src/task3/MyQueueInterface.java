package task3;

public interface MyQueueInterface<E> {
   public boolean add(Object value);
   public void clear();
   public int size();
   public E peek();
   public E poll();
}
