import java.util.*;
public class Main {
    public static boolean isPrime(int num){ //Task2 method
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Task1
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        LinkedHashSet<String> unionSet = new LinkedHashSet<>(set1);
        LinkedHashSet<String> intersectionSet = new LinkedHashSet<>(set1);
        LinkedHashSet<String> differenceSet = new LinkedHashSet<>(set1);

        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);

        differenceSet.removeAll(set2);
        System.out.println("Difference: " + differenceSet);

        //Task2
        GenericStack<Integer> stack = new GenericStack<>();

        int number = 2;
        int count = 0;
        while (count < 50) {
            if (isPrime(number)) {
                stack.push(number);
                count++;
            }
            number++;
        }

        System.out.println("First 50 prime numbers in descending order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        //Task3
        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(4);
        queue.enqueue(2);

        System.out.println(queue);
        System.out.println("Size: " + queue.getSize());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Size: " + queue.getSize());

        //Task4
        MyPriorityQueue<Integer> priorityQueue = new MyPriorityQueue<>();

        priorityQueue.enqueue(3);
        priorityQueue.enqueue(1);
        priorityQueue.enqueue(4);
        priorityQueue.enqueue(8);
        priorityQueue.enqueue(5);
        priorityQueue.enqueue(9);
        priorityQueue.enqueue(2);
        priorityQueue.enqueue(6);
        priorityQueue.enqueue(11);
        priorityQueue.enqueue(3);
        priorityQueue.enqueue(13);

        while (priorityQueue.getSize() > 0) {
            System.out.print(priorityQueue.dequeue() + " ");
        }
    }
}