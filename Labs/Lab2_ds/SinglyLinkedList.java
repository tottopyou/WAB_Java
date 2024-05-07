// Name of student: Roman Hrabovskyi
// Student id : 19385
//University : WAB

public class SinglyLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public void addFirst(E element) {
        head = new Node<>(element, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E removedElement = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return removedElement;
    }
}
