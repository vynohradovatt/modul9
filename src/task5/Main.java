package task5;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "one");
        myHashMap.put(2, "two");
        myHashMap.put(3, "three");
        myHashMap.put(4, "four");
        myHashMap.remove(4);
        System.out.println(myHashMap.size());
    }

}
