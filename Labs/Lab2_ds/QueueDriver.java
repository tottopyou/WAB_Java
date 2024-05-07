// Name of student: Roman Hrabovskyi
// Student id : 19385
//University : WAB

public class QueueDriver {
    public static void main(String[] args) {

        System.out.println("Testing ArrayBasedQueue:");
        Queue<Integer> arrayQueue = new ArrayBasedQueue<>();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        System.out.println("First element: " + arrayQueue.first());
        System.out.println("Dequeued element: " + arrayQueue.dequeue());
        System.out.println("First element after dequeue: " + arrayQueue.first());
        System.out.println("Size: " + arrayQueue.size());
        System.out.println();


        System.out.println("Testing LinkedListQueue:");
        Queue<String> linkedListQueue = new LinkedQueue<>();
        linkedListQueue.enqueue("abc");
        linkedListQueue.enqueue("def");
        linkedListQueue.enqueue("ghi");
        System.out.println("First element: " + linkedListQueue.first());
        System.out.println("Dequeued element: " + linkedListQueue.dequeue());
        System.out.println("First element after dequeue: " + linkedListQueue.first());
        System.out.println("Size: " + linkedListQueue.size());
    }
}
