package collections;

public interface MyStack<T> {
    void push(T obj);

    T pop();

    boolean empty();

    T peek();
}
