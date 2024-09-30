// Given an array, we have to find the average of all the elements in the array.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 3
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

// Example 2:
// Input:  N=6, array[] = {1,2,1,1,5,1}
// Output: 1.8
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8

public class TUF_09 {
    static void AverageOfArr(int arr[]){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += (double)arr[i];
        }
        double avg = sum/arr.length;
        System.out.println("Average of the Array is :"+avg);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        AverageOfArr(arr);
    }
    
}
