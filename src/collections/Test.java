package collections;

public class Test {
    public static void main(String[] args) {
        //Stack example
        MyStack<Integer> myStack = new DoublyLinkedList<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.toString());

        //Deque example
        MyDeque<Integer> myDeque = new DoublyLinkedList<>();
        myDeque.offerFirst(4);
        myDeque.offerLast(5);
        myDeque.offerFirst(3);
        myDeque.pollLast();
        System.out.println(myDeque.toString());

        //task 1
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        for (int i = 0; i < 12; i++) {
            doublyLinkedList.add(i);
        }
        doublyLinkedList.removeFirst();
        doublyLinkedList.removeLast();
        System.out.println("Task 1 result: " + doublyLinkedList.toString());

        //task 5
        DoublyLinkedList linkedList = new DoublyLinkedList();
        for (int i = 1; i < 11; i++) {
            linkedList.add(i);
        }
        System.out.println("Equals? " + doublyLinkedList.compare(linkedList));

        //task 6
        doublyLinkedList.set(6, 78);
        System.out.println("After replace an element: " + doublyLinkedList.toString());

        //task 3
        doublyLinkedList.swap(doublyLinkedList, 0, 1);
        System.out.println("List after swap two elements: " + doublyLinkedList.toString());

        //task 4
        Object[] array = doublyLinkedList.toArray();
        System.out.print("Convert list to Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //task 2
        doublyLinkedList.removeAll();
        System.out.println("\nAfter remove all elements: " + doublyLinkedList.toString());

        //task 7
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        for (int i = 10; i < 21; i++) {
            singlyLinkedList.add(i);
        }
        System.out.println("Singly linked list: " + singlyLinkedList.toString());
        System.out.println("The middle element is: " + singlyLinkedList.middleElement());
    }
}
