public class AnimalLinkedList implements AnimalList {
    private class Node{
        Animal element;
        Node next;
        Node prev;

        Node(Animal element, Node next, Node prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    private int size;
    private Node header;

    public AnimalLinkedList(){
        header = new Node(null, null, null);
        header.next = header;
        header.prev = header;
        size = 0;
    }

    private boolean add(Animal animal, Node node){
        Node newNode = new Node(animal, node, node.prev);
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        size ++;
        return true;
    }

    public boolean add(Animal animal){
        add(animal, header);
        return true;
    }

    public boolean addAll(AnimalArrayList arrayList){
        for (int i = 0; i < arrayList.getSize(); i++) {
            add(arrayList.get(i), header.next);
        }
        return true;
    }

    private Node findNodeByIndex(int i){
        Node current = header.next;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current;
    }

    public Animal get(int index){
        return findNodeByIndex(index).element;
    }

    public void set(int index, Animal element){
        Node node = findNodeByIndex(index);
        Node newNode = new Node(element, node.next, node.prev);
        node.prev.next = newNode;
        node.next.prev = newNode;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0;
    }

    public void clear(){
        header.next = header;
        header.prev = header;
        size = 0;
    }
    public String toString(){
        String result = "{";
        Node current = header.next;
        while (current != header) {
            result += current.element;
            current = current.next;
            result += ", ";
        }
        result += "}";
        return result;
    }
}
