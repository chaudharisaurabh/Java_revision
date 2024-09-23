## Arrays

[back](dataStructures.md)

#### 1D array 

``` java
type var-name[];
OR
type[] var-name;

// both are valid declarations\
int intArray[];
or int[] intArray;

MyClass myClassArray[]; 

Object[]  ao,        // array of Object

Collection[] ca;  // array of Collection\
// of unknown type

```

``` java
int intArray[];    //declaring array\
intArray = new int[20];  // allocating memory to array

OR
int[] intArray = new int[20]; // combining both statements in one

```


``` java
class GFG 
{
    public static void main (String[] args) 
    {         
      // declares an Array of integers.
      int[] arr;
        
      // allocating memory for 5 integers.
      arr = new int[5];
        
      // initialize the first elements of the array
      arr[0] = 10;
        
      // initialize the second elements of the array
      arr[1] = 20;
        
      //so on...
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;
        
      // accessing the elements of the specified array
      for (int i = 0; i < arr.length; i++)
         System.out.println("Element at index " + i + 
                                      " : "+ arr[i]);          
    }
}
```

#### Multi-dimensional arrays

``` java
int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
```


``` java
class multiDimensional
{
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}
```
