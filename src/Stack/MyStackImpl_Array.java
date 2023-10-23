/**
 * Created by Vahe Aghajanyan
 * Date: 10/23/2023
 * Time: 10:44 AM
 */

package Stack;

public class MyStackImpl_Array<T> implements MyStack<T> {

    private Object[] arr = new Object[10];
    private int index = -1;

    @Override
    public boolean empty() {
        return arr.length == 0;
    }

    @Override
    public T peek() {
        return this.index == -1 ? null : (T) arr[this.index];
    }

    @Override
    public T pop() {
        return (T) arr[this.index--];
    }

    @Override
    public T push(T element) {
        if (isFull()) {
            expandCapacity();
        }

        this.arr[++index] = element;
        return element;
    }

    private boolean isFull() {
        return this.index == this.arr.length;
    }

    private void expandCapacity() {
        Object[] newArr = new Object[this.arr.length * 2];
        System.arraycopy(this.arr, 0, newArr, 0, newArr.length);
        this.arr = newArr;
    }
}
