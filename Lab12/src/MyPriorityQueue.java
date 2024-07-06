import java.util.Comparator;
import java.util.PriorityQueue;
public class MyPriorityQueue<E> {
    private final PriorityQueue<E> priorityQueue;
    public MyPriorityQueue() {
        this.priorityQueue = new PriorityQueue<>();
    }
    public MyPriorityQueue(Comparator<? super E> comparator) {
        this.priorityQueue = new PriorityQueue<>(comparator);
    }
    public void enqueue(E newObject){
        priorityQueue.offer(newObject);
    }
    public E dequeue(){
        return priorityQueue.poll();
    }
    public int getSize(){
        return priorityQueue.size();
    }

    @Override
    public String toString() {
        return "PriorityQueue: " + priorityQueue.toString();
    }
}
