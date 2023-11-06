/*Create an abstract class called Animal with an abstract method makeSound(). Derive two classes Dog and Cat from Animal. Implement the makeSound() method in each derived class to make a different sound. Use abstraction to ensure that the makeSound() method is implemented in each derived class.*/
abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks............");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows.....");
    }
}
public class Animal_Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
