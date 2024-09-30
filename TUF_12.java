
import java.util.HashMap;

// Given an unsorted array, remove duplicates from the array.

// Examples:

// Example 1:
// Input: arr[]={2,3,1,9,3,1,3,9}
// Output:  {2,3,1,9}

// Explanation: Removed all the duplicate elements

// Example 2:
// Input: arr[]={4,3,9,2,4,1,10,89,34}
// Output: {3,4,9,2,1,10,34,89}
// Explanation: Removed all the duplicate elements

public class TUF_12 {
    static void removeDuplicate(int arr[]){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if (!mp.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                mp.put(arr[i], 1);
         }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };

        removeDuplicate(arr);
    }
    
}
