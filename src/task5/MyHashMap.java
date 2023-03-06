package task5;

public class MyHashMap<K,V> implements MyHashMapInterface<K,V> {

    private Node<K,V>[] hashTable;
    private int size = 0;

    public MyHashMap(){
        hashTable = new Node[16];
    }

    @Override
    public void put(Object key, Object value) {
        int index = getIndex(key);
        Node node = hashTable[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = hashTable[index];
        hashTable[index] = newNode;
        size++;
    }

    @Override
    public V remove(Object key) {
        int index = getIndex(key);
        Node node = hashTable[index];
        Node prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    hashTable[index] = node.next;
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
        hashTable = new Node[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(Object key) {
        int index = getIndex(key);
        Node node = hashTable[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }
    private int getIndex(Object key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % hashTable.length;
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
