## Deque

[back](dataStructures.md)


The Deque interface present in java.util package is a subtype of the queue interface. The Deque is related to the double-ended queue that supports addition or removal of elements from either end of the data structure. It can either be used as a queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO). Deque is the acronym for double ended queue. 


``` java
public interface Deque extends Queue
```

Creating Deque Objects
Since Deque is an interface, objects cannot be created of the type deque. We always need a class which extends this list in order to create an object. And also, after the introduction of Generics in Java 1.5, it is possible to restrict the type of object that can be stored in the Deque. This type-safe queue can be defined as:


``` java
Deque<Obj> deque = new ArrayDeque<Obj> ();
```


### Functions of Deque that return special values instead of Exceptions

<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/deque-offerfirst-method-in-java/" target="_blank"><strong>offerFirst(element)</strong></a></th><th>This method is used to add an element at the head of the queue. This method is preferable to addFirst() method since this method does not throws an exception when the capacity of the container is full since it returns false.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/deque-offerlast-method-in-java/" target="_blank"><strong>offerLast(element)</strong></a></th><th>This method is used to add an element at the tail of the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.</th></tr><tr><th><strong>pollFirst()</strong></th><th>This method is used to retrieve and remove the element at the head of the deque. This method returns null if the deque is empty.</th></tr><tr><th><strong>pollLast()</strong></th><th>This method is used to retrieve and remove the element at the tail of the deque. This method returns null if the deque is empty.</th></tr><tr><th><strong>peekFirst()</strong></th><th>This method is used to retrieve the element at the head of the deque but doesn't remove the element from the deque. This method returns null if the deque is empty.</th></tr><tr><th><strong>peekLast()</strong></th><th>This method is used to retrieve the element at the tail of the deque but doesn't remove the element from the deque. This method returns null if the deque is empty.</th></tr></tbody></table>



``` java
// Java program to demonstrate the working 
// of a Deque in Java 
import java.util.*; 
  
public class Test { 
    public static void main(String[] args) 
    {
        Deque<Integer> d = new LinkedList<Integer>();
        
        // Adds element to front of queue
        d.offerFirst(10);
        
        // Adds element to end of queue
        d.offerLast(20);
        
        // Adds element to front of queue
        d.offerFirst(5);
        
        // Adds element to end of queue
        d.offerLast(15);
        
        // Retrieve the head element
        System.out.println(d.peekFirst());
        
        // Retrieve the tail element
        System.out.println(d.peekLast());
        
        // Retrieve and remove the head element
        d.pollFirst();
        
        // Retrieve and remove the tail element
        d.pollLast();
        
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}
```

### Functions of Deque that throws Exceptions


<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/deque-addfirst-method-in-java-with-examples/" target="_blank"><strong>addFirst(element)</strong></a></th><th>This method is used to add an element at the head of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/deque-addlast-method-in-java/" target="_blank"><strong>addLast(element)</strong></a></th><th>This method is used to add an element at the tail of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/deque-getfirst-method-in-java/" target="_blank"><strong>getFirst()</strong></a></th><th>This method is used to retrieve, but not remove, the first element of this deque.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/deque-getlast-method-in-java/" target="_blank"><strong>getLast()</strong></a></th><th>This method is used to retrieve, but not remove, the last element of this deque.</th></tr><tr><th><strong>removeFirst()</strong></th><th>This method is used to remove an element from the head of the queue.</th></tr><tr><th><strong>removeLast()</strong></th><th>This method is used to remove an element from the tail of the queue.</th></tr></tbody></table>



``` java
// Java program to demonstrate the working 
// of a Deque in Java 
import java.util.*; 
  
public class Test { 
    public static void main(String[] args) 
    {
        Deque<Integer> d = new LinkedList<Integer>();
        
        // Adds element to front of queue
        d.addFirst(10);
        
        // Adds element to end of queue
        d.addLast(20);
        
        // Adds element to front of queue
        d.addFirst(5);
        
        // Adds element to end of queue
        d.addLast(15);
        
        // Retrieve the head element
        System.out.println(d.getFirst());
        
        // Retrieve the tail element
        System.out.println(d.getLast());
        
        // Retrieve and remove the head element
        d.removeFirst();
        
        // Retrieve and remove the tail element
        d.removeLast();
        
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}
```

#### Traversing a Deque: This code discusses the traversal of a deque in two ways -
 

Using an Iterator\
Using for-each loop


``` java
// Java program to demonstrate the working 
// of Traversal of Deque in Java 
import java.util.*; 
  
public class Test { 
    public static void main(String[] args) 
    {
        Deque<Integer> d = new LinkedList<Integer>();
        
        // Adds element to front of queue
        d.addFirst(10);
        
        // Adds element to end of queue
        d.addLast(20);
        
        // Adds element to front of queue
        d.addFirst(5);
        
        // Adds element to end of queue
        d.addLast(15);
        
        // Traversal using Iterator
        Iterator it = d.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
        
        // Traversal using for-each 
        for(int x: d)
            System.out.print(x + " ");
        System.out.println();

    }
}
```


Traversing a Deque from Last to First: This uses a descendingIterator() to reverse traverse the list from last to first.

``` java
// Java program to demonstrate the working 
// of Reversal Traversal of Deque in Java 
import java.util.*; 
  
public class Test { 
    public static void main(String[] args) 
    {
        Deque<Integer> d = new LinkedList<Integer>();
        
        // Adds element to front of queue
        d.addFirst(10);
        
        // Adds element to end of queue
        d.addLast(20);
        
        // Adds element to front of queue
        d.addFirst(5);
        
        // Adds element to end of queue
        d.addLast(15);
        
        // Traversal using Iterator
        Iterator it = d.descendingIterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
    }
}
```

## ArrayDeque

ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface, Queue Interface, and collection interface. It is also known as Array Double Ended Queue or Array Deck. This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. Few important features of ArrayDeque are as follows: 


Declarations

``` java 
public class ArrayDeque Element
   extends AbstractCollection
   implements DequeElement, Cloneable, Serializable

```

``` java
// Java program to demonstrate working of
// ArrayDeque in Java
import java.util.ArrayDeque;

class GfG{
    public static void main(String args[])
    {
        // Creating empty ArrayDeque
        ArrayDeque<Integer> ad 
        = new ArrayDeque<Integer>();

        // Adding items to the ad using add()
        ad.add(10);
        ad.add(20);
        ad.add(30);
        
        System.out.println(ad);
    }
}
```
### Implementation of ArrayDeque as Stack.

<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-push-method-in-java//" target="_blank"><strong>push(</strong><i><strong>Object element</strong></i><strong>)</strong></a></th><th>Pushes an element on the top of the stack.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-pop-method-in-java/" target="_blank"><strong>pop()</strong></a></th><th>Removes and returns the top element of the stack. An 'EmptyStackException' exception is thrown if we call pop() when the invoking stack is empty.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-peek-method-in-java/" target="_blank"><strong>peek()</strong></a></th><th>Returns the element on the top of the stack, but does not remove it.</th></tr></tbody></table>



``` java
// Java program to demonstrate working of
// ArrayDeque in Java
import java.util.ArrayDeque;

class GfG{
    public static void main(String args[])
    {
        // Creating empty ArrayDeque
        ArrayDeque<Integer> ad 
        = new ArrayDeque<Integer>();

        // Pushing items to the ad using add()
        ad.push(10);
        ad.push(20);
        
        // Returns the top of stack, 20
        System.out.println(ad.peek());
        
        // Returns and Removes the top of stack, 20
        System.out.println(ad.pop());
        
        // Returns the top of stack, 10
        System.out.println(ad.peek());
        
        // Pushes 40
        ad.push(40);
        
        // Returns the top of stack, 40
        System.out.println(ad.peek());
    }
}

```

### Implementation of ArrayDeque as Queue.

<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-add-method-in-java/" target="_blank"><strong>add(element)</strong></a></th><th>This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation. Returns false on unsuccessful implementation.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-remove-method-in-java/" target="_blank"><strong>remove()</strong></a></th><th>This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is empty.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-element-method-in-java/" target="_blank"><strong>element()</strong></a></th><th>This method is similar to peek(). It throws NoSuchElementException when the queue is empty.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-offer-method-in-java/" target="_blank"><strong>offer(element)</strong></a></th><th>This method is used to insert an element in the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-poll-method-in-java/" target="_blank"><strong>poll()</strong></a></th><th>This method removes and returns the head of the queue. It returns null if the queue is empty.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-peek-method-in-java/" target="_blank"><strong>peek()</strong></a></th><th>This method is used to view the head of queue without removing it. It returns Null if the queue is empty.</th></tr></tbody></table>



``` java
// Java program to demonstrate working of
// ArrayDeque in Java
import java.util.ArrayDeque;

class GfG{
    public static void main(String args[])
    {
        // Creating empty ArrayDeque as Queue
        ArrayDeque<Integer> ad 
        = new ArrayDeque<Integer>();

        // Add items to the ad using offer() at last
        ad.offer(10);
        ad.offer(20);
        
        // Returns the front of queue, 10
        System.out.println(ad.peek());
        
        // Returns and Removes the front of queue, 10
        System.out.println(ad.poll());
        
        // Returns the front of queue, 20
        System.out.println(ad.peek());
        
        // Adds 40 to last of queue
        ad.offer(40);
        
        // Returns the front of queue, 20
        System.out.println(ad.peek());
    }
}

```

### Implementation of ArrayDeque as Deque.

<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-add-method-in-java/" target="_blank"><strong>add(element)</strong></a></th><th>This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation. Returns false on unsuccessful implementation.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-remove-method-in-java/" target="_blank"><strong>remove()</strong></a></th><th>This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is empty.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-element-method-in-java/" target="_blank"><strong>element()</strong></a></th><th>This method is similar to peek(). It throws NoSuchElementException when the queue is empty.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-offer-method-in-java/" target="_blank"><strong>offer(element)</strong></a></th><th>This method is used to insert an element in the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-poll-method-in-java/" target="_blank"><strong>poll()</strong></a></th><th>This method removes and returns the head of the queue. It returns null if the queue is empty.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-peek-method-in-java/" target="_blank"><strong>peek()</strong></a></th><th>This method is used to view the head of queue without removing it. It returns Null if the queue is empty.</th></tr></tbody></table>



``` java
// Java program to demonstrate working of
// ArrayDeque in Java
import java.util.ArrayDeque;

class GfG{
    public static void main(String args[])
    {
        // Creating empty ArrayDeque as Deque
        ArrayDeque<Integer> ad 
        = new ArrayDeque<Integer>();

        // Add items to the ad
        ad.offerFirst(10);
        ad.offerLast(20);
        ad.offerFirst(30);
        ad.offerLast(40);
        
        // Returns 30
        System.out.println(ad.peekFirst());
        
        // Returns 40
        System.out.println(ad.peekLast());
        
        // Returns and removes 30
        System.out.println(ad.pollFirst());
        
        // Returns 10
        System.out.println(ad.peekFirst());
        
        // Returns and removes 40
        System.out.println(ad.pollLast());
        
        // Returns 20
        System.out.println(ad.peekLast());
    }
}

```


We also have similar functions that throw Exception in case of unsuccessful operation.

<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-addfirst-method-in-java/" target="_blank"><strong>addFirst(element)</strong></a></th><th>This method is used to add an element at the head of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-addlast-method-in-java/" target="_blank"><strong>addLast(element)</strong></a></th><th>This method is used to add an element at the tail of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-getfirst-method-in-java/" target="_blank"><strong>getFirst()</strong></a></th><th>This method is used to retrieve, but not remove, the first element of this deque.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-getlast-method-in-java/" target="_blank"><strong>getLast()</strong></a></th><th>This method is used to retrieve, but not remove, the last element of this deque.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-removefirst-method-in-java/" target="_blank"><strong>removeFirst()</strong></a></th><th>This method is used to remove an element from the head of the queue.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/arraydeque-removelast-method-in-java/" target="_blank"><strong>removeLast()</strong></a></th><th>This method is used to remove an element from the tail of the queue.</th></tr></tbody></table>