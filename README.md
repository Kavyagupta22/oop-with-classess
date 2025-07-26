# Java Inheritance and Method Overriding Demo

This project demonstrates fundamental object-oriented programming concepts in Java: **classes**, **inheritance**, and **method overriding**.

## Project Structure

```
├── import java.io.java    # Main Java source file
└── README.md             # This file
```

## What This Demo Shows

### 1. Classes
- `Animal` class: A base class with a `speak()` method
- `Dog` class: A subclass that inherits from `Animal`
- `InheritanceExample` class: Contains the main method to run the demo

### 2. Inheritance
- `Dog` extends `Animal` using the `extends` keyword
- `Dog` inherits all methods and properties from `Animal`

### 3. Method Overriding
- `Dog` overrides the `speak()` method from `Animal`
- Uses the `@Override` annotation for clarity
- Demonstrates polymorphic behavior

## How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) installed on your system
- Command line/terminal access

### Steps

1. **Compile the Java file:**
   ```bash
   javac "import java.io.java"
   ```

2. **Run the program:**
   ```bash
   java InheritanceExample
   ```

### Expected Output
```
The animal makes a sound.
The dog barks.
```

## Code Explanation

```java
// Base class
class Animal {
    void speak() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass with inheritance
class Dog extends Animal {
    // Method overriding
    @Override
    void speak() {
        System.out.println("The dog barks.");
    }
}
```

## Key Concepts Demonstrated

- **Classes**: Blueprint for creating objects
- **Inheritance**: `Dog` inherits from `Animal` using `extends`
- **Method Overriding**: `Dog` provides its own implementation of `speak()`
- **Polymorphism**: Same method call produces different results based on object type
- **Runtime Polymorphism**: Method resolution happens at runtime

## Learning Outcomes

After running this demo, you should understand:
- How to create classes in Java
- How inheritance works with the `extends` keyword
- How method overriding allows subclasses to provide specific implementations
- How polymorphism enables flexible, extensible code design

## Next Steps

Try extending this demo by:
- Adding more animal subclasses (Cat, Bird, etc.)
- Creating additional methods to override
- Adding constructors with parameters
- Implementing interfaces for additional abstraction 