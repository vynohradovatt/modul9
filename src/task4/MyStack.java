package task4;

public class MyStack<E> implements MyStackInterface<E> {

    private E[] stack;

    public MyStack(){
        stack = (E[])new Object[0];
    }
    @Override
    public E push(E value) {
        try {
            E[] temp = stack;
            stack = (E[]) new Object[stack.length + 1];
            System.arraycopy(temp, 0, stack, 0, temp.length);
            stack[stack.length - 1] = (E)value;
            return (E)temp;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean remove(int index) {
        try {
            E[] temp = stack;
            stack = (E[]) new Object[stack.length - 1];
            System.arraycopy(temp, 0, stack, 0, index);
            int amountElemAfterIndex = stack.length - index;
            System.arraycopy(temp, index + 1, stack, index, amountElemAfterIndex);
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void clear() {
        stack = (E[])new Object[0];
    }

    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public E peek() {
        if(stack.length > 0){
            return stack[0];
        }
        return null;
    }

    @Override
    public E pop() {
        try {
            E[] temp = stack;
            stack = (E[]) new Object[stack.length - 1];
            System.arraycopy(temp, 1, stack, 0, stack.length);
            return (E)temp;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
