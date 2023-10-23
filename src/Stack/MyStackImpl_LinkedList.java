/**
 * Created by Vahe Aghajanyan
 * Date: 10/23/2023
 * Time: 11:25 AM
 */

package Stack;

import java.util.LinkedList;

public class MyStackImpl_LinkedList<T> implements MyStack<T> {

    private LinkedList<T> list = new LinkedList<>();
    private int index = -1;

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    @Override
    public T peek() {
        return this.list.get(index);
    }

    @Override
    public T pop() {
        return this.list.remove(this.index--);
    }

    @Override
    public T push(T element) {
        this.list.add(element);
        this.index++;
        return this.peek();
    }
}
