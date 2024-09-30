// ?Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}
// Explanation: Rotate the array to right by 2 elements.

// Example 2:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
// Output: {4,5,6,7,1,2,3}
// Explanation: Rotate the array to right by 3 elements.

public class TUF_08 {

    static void rotateArr(int arr[], int k){
        reverseArr(arr, 0, arr.length-1);
        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, arr.length-1);
    }

    static void reverseArr(int arr[],int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void PrintArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 8;
        k = k % arr.length;
        rotateArr(arr, k);
        PrintArr(arr);
    }
    
}
