
import java.util.Arrays;

// Given an unsorted array, find the median of the given array.

// Examples:

// Example 1:
// Input: [2,4,1,3,5]
// Output: 3

// Example 2:
// Input: [2,5,1,7]
// Output: 3.5

public class TUF_10 {
    static double median(int arr[]){
        Arrays.sort(arr);
        if(arr.length % 2 != 0){
            int idx = arr.length/2;
            double median = (double)arr[idx];
            return median;
        }
        else{
            int idx = arr.length/2;
            double median = (double) (arr[idx]+arr[idx-1])/2;
            return median;
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,4,1,3};
        double median = median(arr);
        System.out.println("Median of the Array is : "+ median);
    }
    
}
