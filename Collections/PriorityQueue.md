## PriorityQueue

[back](dataStructures.md)


A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a queue follows First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play. The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.


### Basic Operations on PriorityQueue:
1. boolean add(E element): This method inserts the specified element into this priority queue.
2. public peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
3. public poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.

Example 1: Uses the default min-Heap to implement the PriorityQueue.


``` java
class Test{
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pq.add(10);
        pq.add(20);
        pq.add(15);
        
        // Above PriorityQueue is stored as following
        //       10
        //      /  \
        //    20    15

        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Post poll() PriorityQueue looks like
        //       15
        //      /  
        //    20   

        // Printing the top element again
        System.out.println(pq.peek());
    }
}
```

Example 2: Uses the max-Heap to implement the PriorityQueue.


``` java

// Java program to demonstrate working of
// PriorityQueue in Java
import java.util.*;

class Test{
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pq 
        = new PriorityQueue<Integer>(
            Collections.reverseOrder());

        // Adding items to the pQueue using add()
        pq.add(10);
        pq.add(20);
        pq.add(15);
        
        // Above PriorityQueue is stored as following
        //       20
        //      /  \
        //    10    15

        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Post poll() PriorityQueue looks like
        //       15
        //      /  
        //    10   

        // Printing the top element again
        System.out.println(pq.peek());
    }
}

```

### Methods of Java PriorityQueue Class


<table><tbody><tr><td><strong>Method</strong></td><td><strong>Description</strong></td></tr><tr><td>boolean add(E e)</td><td>Adds element e to the PriorityQueue.</td></tr><tr><td>void clear()</td><td>Clears the PriorityQueue by deleting all the elements.</td></tr><tr><td>Comparatorcomparator()</td><td>Returns a custom comparator used for the ordering of elements in the Queue.</td></tr><tr><td>boolean contains(Object o)</td><td>Checks whether the given element o is present in the PriorityQueue. if yes, returns true.</td></tr><tr><td>Iterator&lt; E &gt;iterator()</td><td>Gets an iterator for the given PriorityQueue.</td></tr><tr><td>boolean offer(E e)</td><td>Insert given element e to the PriorityQueue.</td></tr><tr><td>E peek()</td><td>Used to return the head of the queue without deleting the element.</td></tr><tr><td>E poll()</td><td>If the queue is empty, returns null otherwise it removes and returns the head of the queue.</td></tr><tr><td>int size()</td><td>Returns the number of elements in PriorityQueue.</td></tr><tr><td>Object[] toArray()</td><td>Used to return an array representation of the PriorityQueue.</td></tr><tr><td>T[] toArray(T[] a)</td><td>Used to return an array representation for the Priority Queue with the same runtime type as the specified array a.</td></tr></tbody></table>