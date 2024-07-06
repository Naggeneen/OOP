public class Main {
    public static void main(String[] args) {
//        AnimalArrayList animalArrayList = new AnimalArrayList(30);
//        Animal cat = new Cat("Markiz");
//        Animal dog = new Dog("Baron");
//
//        animalArrayList.add(cat);
//        animalArrayList.add(dog);
//
//        System.out.println("Second animal is " + animalArrayList.get(1));
//
//        Animal newDog = new Dog("Reks");
//
//        animalArrayList.set(1, newDog);
//
//        for(int i=0; i< animalArrayList.getSize(); i++){
//            Animal curAnimal = animalArrayList.get(i);
//            System.out.println("Animal " + curAnimal.getName() + " says ");
//            curAnimal.getSound();
//        }
//        animalArrayList.clear();

        AnimalList animalLinkedList = new AnimalLinkedList();
        Animal cat = new Cat("Markiz");
        Animal dog = new Dog("Baron");

        animalLinkedList.add(cat);
        animalLinkedList.add(dog);

        System.out.println("Second animal is " + animalLinkedList.get(1));

        Animal newDog = new Dog("Reks");

        animalLinkedList.set(1, newDog);
        for(int i=0; i< animalLinkedList.getSize(); i++){
            Animal curAnimal = animalLinkedList.get(i);
            System.out.println("\nAnimal " + curAnimal.getName() + " says ");
            curAnimal.getSound();
        }
        animalLinkedList.clear();
    }
}