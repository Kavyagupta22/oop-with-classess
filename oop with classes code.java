// Demonstration of classes, inheritance, and method overriding in Java

class Animal {
    void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    // Method overriding
    @Override
    void speak() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.speak(); // Calls Animal's speak()
        myDog.speak();    // Calls Dog's overridden speak()
    }
}
