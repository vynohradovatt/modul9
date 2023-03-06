package task3;

public interface MyQueueInterface<E> {
   boolean add(E value);
   void clear();
   int size();
   E peek();
   E poll();
}
