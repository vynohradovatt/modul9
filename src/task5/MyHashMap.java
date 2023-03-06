package task5;

public class MyHashMap<K,V> implements MyHashMapInterface<K,V> {

    private Node<K,V> head;
    private int size = 0;

    public MyHashMap(){
        head = null;
    }

    @Override
    public void put(K key, V value) {
        int index = hash(key);
        Node node = head;
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public V remove(K key) {
        int index = hash(key);
        Node node = head;
        Node prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    head = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return (V)node.value;
            }
            prev = node;
            node = node.next;
        }
        return null;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(K key) {
        int index = hash(key);
        Node node = head;
        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }
    private int hash(K key) {
        return key.hashCode();
    }

    private class Node<K, V>{

        private K key;
        private V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
