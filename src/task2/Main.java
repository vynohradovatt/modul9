package task2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("java");
        myLinkedList.add("hello");
        myLinkedList.remove(1);
        System.out.println(myLinkedList.get(0));
    }
}
