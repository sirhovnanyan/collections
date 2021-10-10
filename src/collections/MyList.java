package collections;

public interface MyList<T> {
    T get(int index);

    void add(T obj);

    void remove(int index);

    boolean remove(T obj);

    int size();

    boolean contains(T obj);

    ListIterator<T> iterator();

    Iterator<T> descendingIterator();

    interface ListIterator<T> {
        boolean hasNext();

        T next();

        boolean hasPrevious();

        T previous();
    }

    interface Iterator<T> {
        boolean hasNext();

        T next();
    }
}
