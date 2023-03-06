package task4;

public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");
        myStack.push("5");
        myStack.remove(3);
        myStack.remove(0);
        myStack.pop();
        System.out.println(myStack.peek());

    }
}
