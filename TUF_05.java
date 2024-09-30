

// Examples:

// Example 1:
// Input: arr[] = {10,5,10,15,10,5};
// Output: 10  3
// 	 5  2
//         15  1
// Explanation: 10 occurs 3 times in the array
// 	      5 occurs 2 times in the array
//               15 occurs 1 time in the array

// Example2: 
// Input: arr[] = {2,2,3,4,4,2};
// Output: 2  3
// 	3  1
//         4  2
// Explanation: 2 occurs 3 times in the array
// 	     3 occurs 1 time in the array
//              4 occurs 2 time in the array

public class TUF_05 {
    static void frequency(int arr[]){
       
       boolean visited[] = new boolean[arr.length];
        
        for(int i = 0;i<arr.length;i++){
            if(visited[i] == true) continue;
            int freq = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    freq++;
                }
            }
            System.out.println(arr[i]+" "+freq);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        frequency(arr);
    }
    
}
