/*
 * Author: Mario G.
 * 
 * Written: March 8th, 2017
 * 
 * Course: Comp. Sci. 142
 *			Winter 2016
 *
 *Bubble Sort Basic Example
 *	 		
 *Compiler: Java
 *
 */
package myClasses;
public class Bubble_Sort {
	
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
 
    private static void swapNumbers(int i, int j, int[] array) {
 
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void main(String[] args) {
        int[] input = { 7, 3, 13, 16, 9, 8, 10};
        bubble_srt(input);
 
    }
}
