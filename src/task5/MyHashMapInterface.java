package task5;

public interface MyHashMapInterface<K,V> {
    public void put(Object key, Object value); //додає пару ключ + значення
    public V remove(Object key); //видаляє пару за ключем
    public void clear(); //очищає колекцію
    public int size(); //повертає розмір колекції
    public V get(Object key); //повертає значення (Object value) за ключем
}
