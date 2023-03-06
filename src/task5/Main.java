package task5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "one");
        myHashMap.put(2, "two");
        myHashMap.put(3, "three");
        myHashMap.put(4, "four");
        myHashMap.put(1, "oneone");
        System.out.println(myHashMap.size());
    }

}
