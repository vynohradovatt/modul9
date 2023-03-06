package task1;

import java.lang.module.FindException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<E> implements MyArrayInterface<E> {
    private E[] list;
    public MyArrayList() {

        list = (E[]) new Object[0];
    }
    @Override
    public int size() {

        return list.length;
    }

    @Override
    public boolean remove(int index) {
        try {
            E[] temp = list;
            list = (E[]) new Object[list.length - 1];
            System.arraycopy(temp, 0, list, 0, index);
            int amountElemAfterIndex = list.length - index;
            System.arraycopy(temp, index + 1, list, index, amountElemAfterIndex);
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = list;
            list = (E[]) new Object[list.length + 1];
            System.arraycopy(temp, 0, list, 0, temp.length);
            list[list.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void clear() {
        list =(E[]) new Object[0];
        }


    @Override
    public E get(int index) {
        try {
            return list[index];
        } catch (ArrayIndexOutOfBoundsException exception) {
            return (E) "Введений індекс поза межами масиву";
        }
    }
}
