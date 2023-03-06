package task3;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("1");
        myQueue.add("2");
        myQueue.add("3");
        myQueue.add("4");
        myQueue.add("5");
        myQueue.poll();
        System.out.println(myQueue.size());

    }
}
