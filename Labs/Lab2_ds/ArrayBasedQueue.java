// Name of student: Roman Hrabovskyi
// Student id : 19385
//University : WAB

public class ArrayBasedQueue<E> implements Queue<E> {
    private static final int CAPACITY = 1000;
    private E[] data;
    private int front = 0;
    private int size = 0;

    public ArrayBasedQueue() {
        this(CAPACITY);
    }

    public ArrayBasedQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(E e) {
        if (size == data.length) throw new IllegalStateException("Queue is full");
        int avail = (front + size) % data.length;
        data[avail] = e;
        size++;
    }

    public E first() {
        if (isEmpty()) return null;
        return data[front];
    }

    public E dequeue() {
        if (isEmpty()) return null;
        E temp = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return temp;
    }
}
