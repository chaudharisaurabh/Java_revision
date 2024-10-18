## Stack

[back](dataStructures.md)


Java Collection framework provides a Stack class that models and implements a Stack data structure. The class is based on the basic principle of last-in-first-out.



``` java

/* A Java Program to show implementation of Stack 
using ArrayDeque */

import java.util.*; 

class GFG { 
    public static void main (String[] args) {
        // Stack<Integer> stack = new Stack<>(); 
        ArrayDeque<Integer> stack = new ArrayDeque<>(); 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        System.out.println(stack.peek()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.peek()); 
    } 
} 

```

``` java

/* A Java Program to show implementation of Stack 
using ArrayDeque */

import java.util.*; 

class GFG { 
    public static void main (String[] args) {
        //     Stack<Integer> stack  = new Stack<>(); 
        ArrayDeque<Integer> stack = new ArrayDeque<>(); 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        System.out.println(stack.size()); 
        System.out.println(stack.isEmpty()); 
    } 
} 

```

### Stack Functions in Java


<table class="linkedlist-java-methods-table"><tbody><tr><th style="background-color: #0D92F4;">Method</th><th style="background-color: #0D92F4;">Description</th><th style="background-color: #0D92F4;">Time Complexity</th></tr></tbody><tbody><tr><td><b><a href="https://www.geeksforgeeks.org/stack-push-method-in-java/" rel="noopener" target="_blank">push(<em>Object element</em>)</a></b></td><td>Pushes  an element on the top of the stack.</td><td>O(1)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/stack-pop-method-in-java/" rel="noopener" target="_blank">pop()</a></b></td><td> Removes and returns the top element of the stack. An 'EmptyStackException' exception is thrown if we call pop() when the invoking stack is empty.</td><td>O(1)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/stack-peek-method-in-java/" rel="noopener" target="_blank">peek()</a></b></td><td>Returns the element on the top of the stack, but does not remove it.</td><td>O(1)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/stack-isempty-method-in-java-with-example/" rel="noopener" target="_blank">isEmpty()</a></b> </td><td>It returns true if nothing is on the top of the stack. Else, returns false.</td><td>O(1)</td></tr><tr><td><b><a href="https://www.geeksforgeeks.org/stack-size-method-in-java-with-example/" rel="noopener" target="_blank">size()</a></b></td><td>This method is used to get the size of the Stack or the number of elements present in the Stack.</td><td>O(1)</td></tr></tbody></table>



