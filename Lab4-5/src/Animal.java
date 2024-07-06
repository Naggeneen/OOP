public class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void getSound(){
        System.out.print("Animal does the sound");
    }

    public String toString(){
        return "Animal{" + name + "}";
    }
}
