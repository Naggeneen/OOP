public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void getSound(){
        System.out.print("bark");
    }
    @Override
    public String toString(){
        return "Dog{" + name + "}";
    }
}
