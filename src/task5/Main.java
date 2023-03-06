package task5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "one");
        myHashMap.put(2, "two");
        myHashMap.put(3, "three");
        myHashMap.put(4, "four");
        myHashMap.remove(4);
        myHashMap.remove(2);
        myHashMap.put(19, "nineteen");
        myHashMap.clear();
        myHashMap.put(67, "sixty seven");
        System.out.println(myHashMap.size());
    }

}
