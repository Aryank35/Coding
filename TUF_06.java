
import java.util.Arrays;

// Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

// Examples:

// Example 1:
// Input: 8 7 1 6 5 9
// Output: 1 5 6 9 8 7
// Explanation: First three elements are in the ascending order and next three elements are in the descending order.

// Example 2:
// Input: 4 2 8 6 15 5 9 20
// Output: 2 4 5 6 20 15 9 8

public class TUF_06 {
    static void rearrangeArray(int arr[]){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = arr.length-1;i>=arr.length/2;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8, 7, 1, 6, 5, 9};
        int arr1[] ={4, 2, 8, 6, 15, 5, 9, 20};

        rearrangeArray(arr);
        System.out.println();
        rearrangeArray(arr1);
    }
    
}
