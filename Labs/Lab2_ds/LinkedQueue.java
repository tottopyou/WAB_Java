// Name of student: Roman Hrabovskyi
// Student id : 19385
//University : WAB

public class LinkedQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public LinkedQueue() { }
    public int size() { return list.size(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public void enqueue(E element) { list.addLast(element); }
    public E first() { return list.first(); }
    public E dequeue() { return list.removeFirst(); }
}
