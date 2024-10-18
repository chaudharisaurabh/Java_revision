## HashSet and LinkedHashSet

[back](dataStructures.md)

### Set Interface in java




The set interface present in the java.util package and extends the Collection interface is an unordered collection of objects in which duplicate values cannot be stored. It is an interface which implements the mathematical set. This interface contains the methods inherited from the Collection interface and adds a feature which restricts the insertion of the duplicate elements. There are two interfaces which extend the set implementation namely SortedSet and NavigableSet.

The Set interface is the sub-interface of Collection Interface. It is mainly implemented by 3 general-purpose classes namely:
* TreeSet - Mainly implements Red-Black Tree which is a self-balancing binary tree. Objects are stored in sorted order.
* HashSet - Implements Hashing for quick search, insertion and delete operations. The objects that we insert into the HashSet does not guarantee to be inserted in the same order.
* LinkedHashSet - Derived class of HashSet. Facilitates access of elements in insertion order.
* Abstract Classes like the provides a skeletal implementation of the Collection interface.
* Interface like SortedSet provides operations related to subset such as finding all the items greater or smaller than a given key or finding a subset in a given range
* Interface like NavigableSet provides navigable operations like floor, ceil, higher, lower etc.


Declaration: The Set interface is declared as:

``` java
public interface Set extends Collection
```

``` java
Set set = new HashSet ();
```

``` java
import java.util.*;

public class GfG{ 
    public static void main(String[] args) 
    { 
        // Set demonstration using HashSet 
        Set<Integer> s = new HashSet<Integer>(); 
        
        // Adding elements to the Set
        s.add(10); 
        s.add(20);
        s.add(30);
        
        // Duplicate element is skipped
        s.add(20);
        System.out.println(s);
    } 
}

```

#### Note:
1. The order of the items is not defined in a HashSet.
2. The order of the items are maintained in a TreeSet in a sorted order. To do this it either uses a Comparable interface implemented by the class or a Comparator interface.


Set s1 = new HashSet(); 
Set s2 = new HashSet();



For Union of these two Sets: s1.addAll(s2) : This is used to append all of the elements from the mentioned collection(s2) to the existing set(s1). The elements are added randomly without following any specific order.\
For Intersection of these two Sets: s1.retainAll(s2) : This is used to retain from this set(s1) all of its elements that are contained in the specified collection(s2).\
For the Difference between these two sets: s1.removeAll(s2) : This is used to remove from this set(s1) all of its elements that are contained in the specified collection(s2).


Working of add(), contains() and iterator() function in HashSet

``` java

// Java program to demonstrate 
// working of HashSet 
import java.util.*; 

class Test 
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> h = new HashSet<String>(); 

        // Adding keys into HashSet usind add() 
        h.add("gfg"); 
        h.add("courses"); 
        h.add("ide"); 

        // Displaying the HashSet 
        System.out.println(h);
        
        // Checks for key "ide"
        System.out.println(h.contains("ide")); 

        // Iterating over hashset 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next() + " "); 
    } 
} 


```

<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-add-method-in-java/" target="_blank"><strong>add()</strong></a></th><th>Used to add the specified element if it is not present. If the element is already present then skip and return false.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-contains-method-in-java/" target="_blank"><strong>contains()</strong></a></th><th>Used to return true if an element is present in set.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-iterator-method-in-java/" target="_blank"><strong>iterator()</strong></a></th><th>Used to return an iterator over the element in the set.</th></tr></tbody></table>


Working of remove(), size() and isEmpty() function in HashSet

``` java
// Java program to demonstrate 
// working of HashSet 
import java.util.*; 

class Test 
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> h = new HashSet<String>(); 

        // Adding keys into HashSet usind add() 
        h.add("gfg"); 
        h.add("courses"); 
        h.add("ide"); 

        // Displaying the size of HashSet 
        System.out.println(h.size());
        
        // Removing the key "ide"
        h.remove("ide");
        
        // Displaying the size of HashSet 
        System.out.println(h.size());
        
        // Using for-each loop to traverse
        for(String s:h)
            System.out.print(s + " ");
        
        // Checking whether the set is empty or not
        System.out.println(h.isEmpty());
    } 
} 

```

<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-add-method-in-java/" target="_blank"><strong>add()</strong></a></th><th>Used to add the specified element if it is not present. If the element is already present then skip and return false.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-contains-method-in-java/" target="_blank"><strong>contains()</strong></a></th><th>Used to return true if an element is present in set.</th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-iterator-method-in-java/" target="_blank"><strong>iterator()</strong></a></th><th>Used to return an iterator over the element in the set.</th></tr></tbody></table>


## LinkedHashSet

``` java
LinkedHashSet<String> hs = new LinkedHashSet<String>();
```

Contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
Maintains insertion order.

``` java
// Java program to demonstrate 
// working of LinkedHashSet 
import java.util.*; 

class Test 
{ 
    public static void main(String[]args) 
    { 
        LinkedHashSet<Integer> s 
        = new LinkedHashSet<Integer>(); 

        // Adding keys into LinkedHashSet usind add() 
        s.add(10); 
        s.add(20); 
        s.add(30); 
        
        // Traversing the set 
        for(Integer x: s)
            System.out.print(x + " ");
    } 
}

```


Example 2: When duplicate elements are inserted.

``` java
// Java program to demonstrate 
// working of LinkedHashSet 
import java.util.*; 

class Test 
{ 
    public static void main(String[]args) 
    { 
        LinkedHashSet<Integer> s 
        = new LinkedHashSet<Integer>(); 

        // Adding keys into HashSet usind add() 
        s.add(10); 
        s.add(20); 
        s.add(30);
        
        // Addition of a duplicate element is
        // skipped and the order is maintained
        s.add(20);
        
        // Displaying the set 
        System.out.println(s);
    } 
} 

```

Example 3: Showing the removal of elements.

``` java
// Java program to demonstrate 
// working of LinkedHashSet 
import java.util.*; 

class Test 
{ 
    public static void main(String[]args) 
    { 
        LinkedHashSet<Integer> s 
        = new LinkedHashSet<Integer>(); 

        // Adding keys into HashSet usind add() 
        s.add(10); 
        s.add(20); 
        s.add(30);
        
        // Addition of a duplicate element is
        // skipped and the order is maintained
        s.add(20);
        
        // Displaying the set 
        System.out.println(s);
    } 
} 

```

<table><tbody><tr><th>Method</th><th>Description</th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-add-method-in-java/" target="_blank"><strong>add()</strong></a></th><th><span style="background-color:rgb(247,247,248);color:rgb(55,65,81);">Adds an element to the LinkedHashSet if it is not already present.</span></th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-contains-method-in-java/" target="_blank"><strong>contains()</strong></a></th><th><span style="background-color:rgb(247,247,248);color:rgb(55,65,81);">Checks if the LinkedHashSet contains a specific element.</span></th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-remove-method-in-java/" target="_blank"><strong>remove()</strong></a></th><th><span style="background-color:rgb(247,247,248);color:rgb(55,65,81);">Removes a specified element from the LinkedHashSet.</span></th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-size-method-in-java/" target="_blank"><strong>size()</strong></a></th><th><span style="background-color:rgb(247,247,248);color:rgb(55,65,81);">Returns the number of elements in the LinkedHashSet.</span></th></tr><tr><th><a href="https://www.geeksforgeeks.org/hashset-isempty-method-in-java/" target="_blank"><strong>isEmpty()</strong></a></th><th><span style="background-color:rgb(247,247,248);color:rgb(55,65,81);">Checks if the LinkedHashSet is empty (contains no elements).</span></th></tr></tbody></table>

## HashSet vs TreeSet


