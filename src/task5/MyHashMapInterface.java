package task5;

public interface MyHashMapInterface<K,V> {
    void put(K key, V value); //додає пару ключ + значення
    V remove(K key); //видаляє пару за ключем
    void clear(); //очищає колекцію
    int size(); //повертає розмір колекції
    V get(K key); //повертає значення (Object value) за ключем
}
