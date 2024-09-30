// Examples:

// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 0
// Explanation: 0 is the smallest element in the array. 

// Example2: 
// Input: arr[] = {8,10,5,7,9};
// Output: 5
// Explanation: 5 is the smallest element in the array.

public class TUF_01 {

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The Smallest element in the array is "+min);
    }
}