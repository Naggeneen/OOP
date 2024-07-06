public interface AnimalList {
    public abstract boolean add(Animal animal);
    Animal get(int index);
    int getSize();
    void set(int index, Animal element);
    void clear();
}
