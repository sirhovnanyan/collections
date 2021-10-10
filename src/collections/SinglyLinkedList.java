package collections;

public class SinglyLinkedList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void add(T obj) {
        Node<T> node = new Node(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    public void remove(int index) {
        T value = get(index);
        remove(value);
    }

    public boolean remove(T obj) {
        if (first.value.equals(obj)) {
            first = first.next;
            size--;
            return true;
        }
        Node<T> current = first;
        for (int i = 0; i < size() - 1; i++) {
            if (current.next.value.equals(obj)) {
                if (i == size - 2) {
                    current.next = null;
                    last = current;
                } else {
                    current.next = current.next.next;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean contains(T obj) {
        Node<T> current = first;
        while (current != null) {
            if (current.value == obj)
                return true;
            current = current.next;
        }
        return false;
    }

    private class Node<T> {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }

    public T middleElement() {
        Node<T> ptr1 = first;
        Node<T> ptr2 = first;

        while (ptr1 != null && ptr1.next != null) {
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;
        }
        return ptr2.value;
    }
}
