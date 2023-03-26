package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> str = new MyArrayList<>();
        str.add("one");
        str.add("two");
        str.add("tree");
        str.add("four");
        str.add("five");
	str.add("sixth");
        str.remove(3);

        System.out.println(str.size());
    }
}
