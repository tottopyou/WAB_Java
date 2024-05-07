// Name of student: Roman Hrabovskyi
// Student id : 19385
//University : WAB

public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E first();
    E dequeue();
}
