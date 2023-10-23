package Stack;

public interface MyStack<T> {
    public boolean empty();

    public T peek();

    public T pop();

    public T push(T element);
}
