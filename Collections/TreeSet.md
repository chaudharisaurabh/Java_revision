## TreeSet

[back](dataStructures.md)


TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage. The ordering of the elements is maintained by a set using their natural ordering. This must be consistent with equals if it is to correctly implement the Set interface.

``` java
// Java program to demonstrate TreeSet
import java.util.*;

class TreeSetExample {

    public static void main(String[] args)
    {
        
        // Creating an empty TreeSet
        TreeSet<String> s = new TreeSet<String>();

        // Elements are added using add() method
        s.add("gfg");
        s.add("courses");
        s.add("ide");
        
        // Displaying the TreeSet
        // in sorted order
        System.out.println(s);
        
        // Checking whether "ide" is present 
        // or not
        System.out.println(s.contains("ide"));
        
        // Iterator to traverse the TreeSet
        Iterator<String> i = s.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}

```

Example 2: Working of remove() and for-each way of traversal in TreeSet.

``` java
// Java program to demonstrate TreeSet
import java.util.*;

class TreeSetExample {

    public static void main(String[] args)
    {
        
        // Creating an empty TreeSet
        TreeSet<Integer> s = new TreeSet<Integer>();

        // Elements are added using add() method
        s.add(10);
        s.add(5);
        s.add(2);
        s.add(15);
        
        // Removing 5 from TreeSet
        s.remove(5);
        
        // foreach way of traversal
        for(Integer x:s)
            System.out.print(x + " ");
    }
}


```

Functions common to both TreeSet and HashSet:

<table class="linkedlist-java-methods-table"><tbody><tr><th style="background-color: #0D92F4">Method</th><th style="background-color: #0D92F4">Description</th><th style="background-color: #0D92F4">Time Complexity</th></tr></tbody><tbody><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-add-method-in-java/" rel="noopener" target="_blank">add(Object o)</a></b></td><td>This method will add the specified element according to the same sorting order mentioned during the creation of the TreeSet. Duplicate entires will not get added.</td><td>O(log n)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-contains-method-in-java/" rel="noopener" target="_blank">contains(Object o)</a></b></td><td>This method will return true if given element is present in TreeSet else it will return false.</td><td>O(log n)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-remove-method-in-java/" rel="noopener" target="_blank">remove(Object o)</a></b></td><td>This method is used to return a specific element from the set.</td><td>O(log n)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-size-method-in-java/" rel="noopener" target="_blank">size()</a></b></td><td>This method is used to return the size of the set or the number of elements present in the set.</td><td>O(1)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-isempty-method-in-java/" rel="noopener" target="_blank">isEmpty()</a></b></td><td>This method is used to return true if this set contains no elements or is empty and false for the opposite case.</td><td>O(1)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-iterator-method-in-java/" rel="noopener" target="_blank">Iterator iterator()</a></b></td><td>Returns an iterator for iterating over the elements of the set.</td></tr></tbody></table>


Functions present only in TreeSet.

<table class="linkedlist-java-methods-table"><tbody><tr><th style="background-color: #0D92F4">Method</th><th style="background-color: #0D92F4">Description</th><th style="background-color: #0D92F4">Time Complexity</th></tr></tbody><tbody><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-lower-method-in-java/" rel="noopener" target="_blank">lower(E e)</a></b></td><td>This method returns the greatest element in this set strictly less than the given element, or null if there is no such element.<br></td><td>O(log n)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-higher-method-in-java-with-examples/" rel="noopener" target="_blank">higher(E e)</a></b></td><td>This method returns the least element in this set strictly greater than the given element, or null if there is no such element.<br></td><td>O(log n)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-floor-method-in-java-with-examples/" rel="noopener" target="_blank">floor(E e)</a></b></td><td>This method returns the greatest element in this set less than or equal to the given element, or null if there is no such element.</td><td>O(log n)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-ceiling-method-in-java-with-examples/" rel="noopener" target="_blank">ceiling(E e)</a></b></td><td>This method returns the least element in this set greater than or equal to the given element, or null if there is no such element.</td><td>O(log n)</td></tr></tbody></table>


Example 3: Working of the above functions.

``` java
// Java program to demonstrate TreeSet
import java.util.*;

class TreeSetExample {

    public static void main(String[] args)
    {
        
        // Creating an empty TreeSet
        TreeSet<Integer> s = new TreeSet<Integer>();

        // Elements are added using add() method
        s.add(10);
        s.add(5);
        s.add(2);
        s.add(15);
        
        // Prints the largest value lower than 5
        // Here it is 2
        System.out.println(s.lower(5));
        
        // Prints the smallest higher value than 5
        // Between 10 and 15 smallest is 10
        System.out.println(s.higher(5));
        
        // Value <= 5
        System.out.println(s.floor(5));
        
        // Value >= 5
        System.out.println(s.ceiling(5));
    }
}

```

#### Time Complexity and Working of TreeSet:
TreeSet is basically an implementation of a self-balancing binary search tree like a Red-Black Tree. Therefore operations like add, remove, and the search takes O(log(N)) time. The reason is that in a self-balancing tree, it is made sure that the height of the tree is always O(log(N)) for all the operations. Therefore, this is considered as one of the most efficient data structure in order to store the huge sorted data and perform operations on it. However, operations like printing N elements in the sorted order takes O(N) time.

<table class="linkedlist-java-methods-table"><tbody><tr><th style="background-color: #0D92F4">Method</th><th style="background-color: #0D92F4">Description</th></tr></tbody><tbody><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-first-method-in-java/" rel="noopener" target="_blank">first()</a></b></td><td>This method will return first element in TreeSet if TreeSet is not null else it will throw NoSuchElementException.<br></td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-last-method-in-java/" rel="noopener" target="_blank">last()</a></b></td><td>This method will return last element in TreeSet if TreeSet is not null else it will throw NoSuchElementException.<br></td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-headset-method-in-java/" rel="noopener" target="_blank">headSet(Object toElement)</a></b></td><td>This method will return elements of TreeSet which are less than the specified element.</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/treeset-tailset-method-in-java/" rel="noopener" target="_blank">tailSet(Object fromElement)</a></b></td><td>This method will return elements of TreeSet which are greater than or equal to the specified element.</td></tr></tbody></table>