## Inheritance in Java

It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class.\
In Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well.


### Why Do We Need Java Inheritance?

1. Code reusability
2. Method overriding
3. Abstraction 


Example

```java
    class Bicycle{
        public int gear;
        public int speed;

        //constructor
        public Bicycle(int gear, int speed)
        {
            this.gear = gear;
            this.speed = speed;
        }
         // the Bicycle class has three methods
        public void applyBrake(int decrement)
        {
            speed -= decrement;
        }

        public void speedUp(int increment)
        {
            speed += increment;
        }

        // toString() method to print info of Bicycle
        public String toString()
        {
            return ("No of gears are " + gear + "\n"
                    + "speed of bicycle is " + speed);
        }
    }

    // derived class
    class MountainBike extends Bicycle {

        // the MountainBike subclass adds one more field
        public int seatHeight;

        // the MountainBike subclass has one constructor
        public MountainBike(int gear, int speed,
                            int startHeight)
        {
            // invoking base-class(Bicycle) constructor
            super(gear, speed);
            seatHeight = startHeight;
        }

        // the MountainBike subclass adds one more method
        public void setHeight(int newValue)
        {
            seatHeight = newValue;
        }

        // overriding toString() method
        // of Bicycle to print more info
        @Override 
        public String toString()
        {
            return (super.toString() + "\nseat height is "
                    + seatHeight);
        }
    }

    // driver class
    public class Test {
        public static void main(String args[])
        {

            MountainBike mb = new MountainBike(3, 100, 25);
            System.out.println(mb.toString());
        }
    }
````

### Java Inheritance Types

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance
4. Multiple Inheritance
5. Hybrid Inheritance

#### Single Inheritance

In single inheritance, a sub-class is derived from only one super class. It inherits the properties and behavior of a single-parent class. Sometimes, it is also known as simple inheritance. In the below figure, ‘A’ is a parent class and ‘B’ is a child class. The class ‘B’ inherits all the properties of the class ‘A’.

![drawing](https://media.geeksforgeeks.org/wp-content/uploads/20220728111827/1-660x329.jpg)

``` java
    // Java program to illustrate the
// concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

// Parent class
class One {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Two extends One {
    public void print_for() { System.out.println("for"); }
}

// Driver class
public class Main {
      // Main function
    public static void main(String[] args)
    {
        Two g = new Two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
```

#### Multilevel Inheritance

In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes. In the below image, class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. In Java, a class cannot directly access the grandparent’s members.

![drawing](https://media.geeksforgeeks.org/wp-content/uploads/20220728111913/2-660x329.jpg)

``` java
// Importing required libraries
import java.io.*;
import java.lang.*;
import java.util.*;

// Parent class One
class One {
    // Method to print "Geeks"
    public void print_geek() {
        System.out.println("Geeks");
    }
}

// Child class Two inherits from class One
class Two extends One {
    // Method to print "for"
    public void print_for() {
        System.out.println("for");
    }
}

// Child class Three inherits from class Two
class Three extends Two {
    // Method to print "Geeks"
    public void print_lastgeek() {
        System.out.println("Geeks");
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        // Creating an object of class Three
        Three g = new Three();
        
        // Calling method from class One
        g.print_geek();
        
        // Calling method from class Two
        g.print_for();
        
        // Calling method from class Three
        g.print_lastgeek();
    }
}

```