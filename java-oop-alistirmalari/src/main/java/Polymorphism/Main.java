package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal Cat = new Cat();
        Animal Dog = new Dog();

        Cat.makeSound();
        Dog.makeSound();
    }
}
