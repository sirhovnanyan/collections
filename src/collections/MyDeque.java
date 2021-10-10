package collections;

public interface MyDeque<T> {
    void addFirst(T obj);

    void addLast(T obj);

    T removeFirst();

    T removeLast();

    boolean offerFirst(T obj);

    boolean offerLast(T obj);

    T poll();

    T pollFirst();

    T pollLast();
}
