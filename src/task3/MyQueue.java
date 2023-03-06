package task3;

import java.util.Queue;
import java.util.Stack;

public class MyQueue<E> implements MyQueueInterface {

    private E[] array;

    public MyQueue(){
        array = (E[])new Object[0];
    }

    @Override
    public boolean add(Object value) {
        try {
            E[] temp = array;
            array = (E[]) new Object[array.length + 1];
            System.arraycopy(temp, 0, array, 0, temp.length);
            array[array.length - 1] = (E) value;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void clear() {
        array = (E[])new Object[0];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public Object peek() {
        if(array.length > 0){
            return array[0];
        } else {
        }
        return null;
    }

    @Override
    public Object poll() {
        try {
            E[] temp = array;
            array = (E[]) new Object[array.length - 1];
            System.arraycopy(temp, 1, array, 0, array.length);
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }
}
