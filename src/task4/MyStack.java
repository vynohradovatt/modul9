package task4;

public class MyStack<E> implements MyStackInterface {

    private E[] stack;

    public MyStack(){
        stack = (E[])new Object[0];
    }
    @Override
    public Object push(Object value) {
        try {
            E[] temp = stack;
            stack = (E[]) new Object[stack.length + 1];
            System.arraycopy(temp, 0, stack, 0, temp.length);
            stack[stack.length - 1] = (E)value;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
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
    public Object peek() {
        if(stack.length > 0){
            return stack[0];
        } else {
        }
        return null;
    }

    @Override
    public Object pop() {
        try {
            E[] temp = stack;
            stack = (E[]) new Object[stack.length - 1];
            System.arraycopy(temp, 1, stack, 0, stack.length);
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }
}
