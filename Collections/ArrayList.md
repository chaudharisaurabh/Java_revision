## ArrayList

[back](dataStructures.md)


ArrayList is a part of collection framework and is present in java.util package. It provides us dynamic arrays in Java. Though it may be slower than standard arrays, it can be helpful in programs where lots of manipulation in the array is needed.


### Constructor methods for ArrayList in java

ArrayList(): This constructor is used to build an empty array list.
ArrayList(Collection c): This constructor is used to build an array list initialized with the elements from collection c.
ArrayList(int capacity): This constructor is used to build an array list with initial capacity being specified.

ArrayList<Integer> arrli = new ArrayList<Integer>();

``` java

// Java program to demonstrate working of ArrayList in Java
import java.io.*;
import java.util.*;

class arrayli
{
    public static void main(String[] args)
                       throws IOException
    {
        // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying ArrayList after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i=0; i<arrli.size(); i++)
            System.out.print(arrli.get(i)+" ");
    }
}

```

### Methods in Java ArrayList:

``` java

forEach​(): //Performs the given action for each element of the Iterable until all elements have been processed, or the action throws an exception.
contains​(Object o): //Returns true if this list contains the specified element.
remove​(int index): //Removes the element at the specified position in this list.
remove​(Object o): //Removes the first occurrence of the specified element from this list, if it is present.
get​(int index): //Returns the element at the specified position in this list.
subList​(int fromIndex, int toIndex): //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
set​(int index, E element): //Replaces the element at the specified position in this list with the specified element.
size​(): //Returns the number of elements in this list.
removeAll​(): //Removes all of the elements that are contained in the specified collection from the list.
isEmpty​(): //Returns true if this list contains no elements.
void clear(): //This method is used to remove all the elements from any list.
void add(int index, Object element): //This method is used to insert a specific element at a specific position index in a list.
int indexOf(Object O): //The index of the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.

int lastIndexOf(Object O): //The index of the last occurrence of a specific element is either returned, or -1 in case the element is not in the list.

```

### List Iterator in java

``` java

hasPrevious() - //It is used to check if we have previous item for the item pointed by current iterator or not.
previous() - //It returns the previous element of the list, and moves the iterator one position back.
add() -0// It is used to add an item while iterating through the List.
set() - //replaces the element returned by either next() or previous() with the specified element
nextIndex() //returns the index of the element that the next() method will return
previousIndex() - //returns the index of the element that the previous() method will return

```

``` java
import java.util.*;

class Gfg{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just before 
        // first element
        ListIterator<Integer> it = list.listIterator();
        
        // While there is a next element of the 
        // current iterator
        while(it.hasNext())
        {   
            // Print the next element and increment
            // iterator by one position
            System.out.println(it.next());
        }
    }
}

```

Backward Traversal using ListIterator: This time use the same List as above and create an iterator pointing to the last position that is the position just after the last element in the List.

``` java
import java.util.*;

class Gfg{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just after 
        // last element
        ListIterator<Integer> it = list.listIterator(list.size());
        
        // While there is a previous element of the 
        // current iterator
        while(it.hasPrevious())
        {   
            // Print the previous element and decrement
            // iterator by one position
            System.out.println(it.previous());
        }
    }
}

```

Example of set() method: The set() methods sets or replaces the item last returned by next() or previous() method with a given value.

``` java


import java.util.*;

class Gfg{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just after 
        // last element
        ListIterator<Integer> it = list.listIterator(list.size());
        
        // While there is a previous element of the 
        // current iterator
        while(it.hasPrevious())
        {   
            int x = (Integer)it.previous();
            
            // Replaces last element returned by previous()
            // everytime with double of its value.
            it.set(x*2);
        }
        
        // Print list
        System.out.println(list);
        
    }
}
```

add() method: The add() method in List interface is used to add an element just before the current iterator position.


``` java

import java.util.*;

class Gfg{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just before 
        // first element
        ListIterator<Integer> it = list.listIterator();
        
        // While there is a next element of the 
        // current iterator
        while(it.hasNext())
        {   
            // Adds an element 5 just before the 
            // current iterator position
            it.add(5);
            
            // Increments iterator one position ahead
            it.next();
        }
        
        // Print list
        System.out.println(list);
        
    }
}


```

### ArrayList methods

add(Object): This method is used to add an element at the end of the ArrayList.
add(int index, Object): This method is used to add an element at a specific index in the ArrayList and moves all element previously present from that index one position ahead.

``` java
// Java program to add elements
// to an ArrayList

import java.util.*;

public class GFG {

    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println(al);
    }
}

```

remove(Object): This method is used to simply remove an object from the ArrayList. If there are multiple such objects, then the first occurrence of the object is removed.
remove(int index): Since an ArrayList is indexed, this method takes an integer value which simply removes the element present at that specific index in the ArrayList. After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.


``` java


import java.util.*;

class Test{
    public static void main (String[] args) {
        
        // Create a ArrayList
        ArrayList<String> al = new ArrayList<String>();
    
        al.add("geeks");
        al.add("ide");
        al.add("courses");
    
        System.out.println(al.contains("ide"));
        al.remove(1);
        System.out.println(al.contains("ide"));
        
        al.remove("courses");
        System.out.println(al.contains("courses"));
    }
}

```

get(index): The get() method of ArrayList in Java is used to get the element of a specified index within the list. It throws an IndexOutOfBounds exception if the index is not within the range of ArrayList.
set(index, Object): The set() method of java.util.ArrayList class is used to replace the element at the specified position in this list with the specified element.
indexOf(Object): The indexOf() method of ArrayList returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
lastIndexOf(Object): The lastIndexOf() method of ArrayList returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

``` java

import java.util.*;

class Test{
    public static void main (String[] args) {
        
        // Create a ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
    
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);
    
        System.out.println(al.get(1));
        al.set(1, 40);
        System.out.println(al.get(1));
        System.out.println(al.indexOf(10));
        System.out.println(al.lastIndexOf(10));
        System.out.println(al.indexOf(50));
    }
}

```

clear(): This method is simply used to clear an ArrayList by deleting all of its elements. It's return type is void and it doesn't return anything.

``` java
import java.util.*;

class Test{
    public static void main (String[] args) {
        
        // Create a ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
    
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);
    
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
    }
}


```
