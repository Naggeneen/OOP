import java.util.*;
public class Main {
    // Task 1
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    // Task 2
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (int i = 1; i < list.length; i++){
            if (list[i].compareTo(max) > 0){
                max = list[i];
            }
        }
        return max;
    }

    // Task 3
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
        }
        return max;
    }

    // Task 4
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<>();
        for (E element : list){
            if (!newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }

    // Task 5
    static class Point implements Comparable<Point>{
        double x, y;

        Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point other){
            if (this.x == other.x){
                return Double.compare(this.y, other.y);
            } else{
                return Double.compare(this.x, other.x);
            }
        }

        public String toString(){
            return "Point{" + x + ", " + y + "}";
        }
    }

    static class CompareY implements Comparator<Point>{
        public int compare(Point p1, Point p2){
            if (p1.y == p2.y){
                return Double.compare(p1.x, p2.x);
            } else{
                return Double.compare(p1.y, p2.y);
            }
        }
    }

    public static void sortPoints(){
        Point[] points = new Point[100];
        Random random = new Random();
        for (int i = 0; i < points.length; i++){
            points[i] = new Point(random.nextDouble() * 1000, random.nextDouble() * 1000);
        }

        System.out.println("Points sorted by x-coordinate:");
        Arrays.sort(points);
        for (int i =0; i<points.length; i++){
            System.out.println(points[i]);
        }

        System.out.println("\nPoints sorted by y-coordinate:");
        Arrays.sort(points, new CompareY());
        for (int i=0; i< points.length;i++){
            System.out.println(points[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Linear Search: " + linearSearch(intArray, 3)); //Task1

        System.out.println("Max in Array: " + max(intArray)); //Task2

        ArrayList<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, 1, 2, 3, 4, 5);
        System.out.println("Max in ArrayList: " + max(intList)); //Task3

        ArrayList<Integer> duplicatesList = new ArrayList<>();
        Collections.addAll(duplicatesList, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        System.out.println("Remove Duplicates: " + removeDuplicates(duplicatesList)); //Task4

        sortPoints(); //Task5

        //Task6
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        long iteratorTime = endTime - startTime;
        System.out.println("Time to traverse using iterator: " + iteratorTime + " milliseconds");


        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        long getTime = endTime - startTime;
        System.out.println("Time to traverse using get(index): " + getTime + " milliseconds");
    }
}