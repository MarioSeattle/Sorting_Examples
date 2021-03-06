/*
 * Author: Mario G.
 * 
 * Written: March 8th, 2017
 * 
 * Course: Comp. Sci. 142
 *			Winter 2016
 *Selection Sort Basic Example
 *	 		
 *Compiler: Java
 *
 */
package myClasses;

public class Insertion_Sort {

    
public static int[] doInsertionSort(int[] array){
        
    int temp;

 for (int i = 1; i < array.length; i++) {

           for(int j = i ; j > 0 ; j--){
               if(array[j] < array[j-1]){
                   temp = array[j];
                   array[j] = array[j-1];
                   array[j-1] = temp;
               }
           }

      }
       return array;
}

 static void printArray(int[] inputarray){

	 for(int i:inputarray){
            System.out.print(i);
            System.out.print(", ");
        }
    	System.out.println();
 }
   
public static void main(String a[]){
    
	int[] array = {7, 3, 13, 16, 9, 8, 10};

	System.out.println("Before sorting elements");
	printArray(array);

   int[] resarray = doInsertionSort(array);

   System.out.println("After sorting elements");
   printArray(array);
      
}
}



