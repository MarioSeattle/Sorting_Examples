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
public class Selection_Sorting {

	public static class Selection_Sort
	{
	    static void selection_Sort(int[] inputArray)
	    {
	        int temp, pos;
	 
	        for (int i = 0; i < inputArray.length - 1; i++)
	        {
	            pos = i;
	 
	            //smallest element between (i+1) element and last element
	 
	            for (int j = i+1; j < inputArray.length; j++)
	            {
	                if(inputArray[j] < inputArray[pos] )
	                {
	                    pos = j;
	                }
	            }
	 
	            //Swapping inputArray[i] and inputArray[pos]
	 
	            temp = inputArray[i];
	 
	            inputArray[i] = inputArray[pos];
	 
	            inputArray[pos] = temp;
	        }
	 
	        for (int i = 0; i < inputArray.length; i++)
	        {
	            System.out.print(inputArray[i] + " ");
	        }
	 
	        System.out.println();
	    }
	 
	    public static void main(String[] args)
	    {
	        selection_Sort(new int[] {7, 3, 13, 16, 9, 8, 10});
	 
	    }
	}

}//end class
