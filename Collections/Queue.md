## Queue

[back](dataStructures.md)


The Queue interface present in the java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order.

### Charachteristic of a queue

1. The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
2. The Java Queue supports all methods of Collection interface including insertion, deletion etc.
3. LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
4. If any null operation is performed on BlockingQueues, NullPointerException is thrown.
5. The Queues which are available in java.util package are Unbounded Queues.
6. The Queues which are available in java.util.concurrent package are the Bounded Queues.
7. All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively. The Deques support element insertion and removal at both ends.



``` java
public interface Queue extends Collection
```

#### Creating Queue Objects
Since Queue is an interface, objects cannot be created of the type queue. We always need a class which extends this list in order to create an object. And also, after the introduction of Generics in Java 1.5, it is possible to restrict the type of object that can be stored in the Queue. This type-safe queue can be defined as:

``` java
// Obj is the type of the object to be stored in Queue
Queue<Obj> queue = new ArrayDeque<Obj> ();
```


### What should be preferred ArrayDeque or LinkedList?

1. ArrayDeque is generally preferred because of its faster execution and cache-friendly nature.
2. The time complexity for adding and removing items in a LinkedList is O(1) for every worst case. But for ArrayDeque it is amortized O(1). This means that for few operations which require internal resize of the array, the time of operation might increase to O(n) or linear time.
3. Therefore, in general, ArrayDeque is faster but it doesn't guarantee a constant time complexity for every worst case. So unless and until a very individual or particular operation is concerned in real-time, ArrayDeque performs better than the LinkedList.



``` java
/* A Java Program to show implementation of Queue 
using ArrayDeque */

import java.util.*; 

class GFG { 
    public static void main (String[] args) {
        // Queue<Integer> q 
        // = new LinkedList<Integer>(); 
        Queue<Integer> q 
        = new ArrayDeque<Integer>(); 
        q.offer(10); 
        q.offer(20); 
        q.offer(30); 
        System.out.println(q.size()); 
        System.out.println(q.isEmpty()); 
        System.out.println(q); 
    } 
}

```



``` java

```