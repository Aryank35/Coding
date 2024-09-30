
import java.util.HashSet;
import java.util.Set;

// Find all the non-repeating elements for a given array. Outputs can be in any order.

// Examples:

// Example 1:
// Input:
//  Nums = [1,2,-1,1,3,1]
// Output:
//  2,-1,3
// Explanation:
//  1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

// Example 2:
// Input:
//  Nums = [1,2,3]
// Output:
//  1,2,3
// Explanation:
//  All elements present in the array occur once. Hence, every element is non-repeating.
public class TUF_15 {
    static void uniqueElement(int arr[]){
        Set<Integer> uniqueElement = new HashSet<>();
        for(int i: arr){
            
            uniqueElement.add(i);
        }
        for(int nums: uniqueElement){
            System.out.print(nums + " ");
        }
    }

    static void nonRepeatingElement(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int freq = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    freq++;
                }
            }
            if(freq == 1){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-1,1,3,1,2};
        // uniqueElement(arr);
        nonRepeatingElement(arr);
    }
    
}
