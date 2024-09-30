
import java.util.HashSet;
import java.util.Set;

// Find all the repeating elements present in an array.

// Examples:

// Example 1:
// Input: 
// Arr[] = [1,1,2,3,4,4,5,2]
// Output:
//  1,2,4
// Explanation:
//  1,2 and 4 are the elements which are occurring more than once.

// Example 2:
// Input:
//  Arr[] = [1,1,0]
// Output:
//  1
// Explanation:
//  Only 1 is occurring more than once in the given array.

public class TUF_14 {
    static void repeatingElements(int arr[]){
        Set<Integer> unique = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();

        for(int num: arr){
            if(!unique.add(num)){
                repeated.add(num);
            }
        }
        for(int num: repeated){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,2,6,7,7,7,9,8,1};
        repeatingElements(arr);
    }
    
}
