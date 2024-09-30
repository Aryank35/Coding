// Problem Statement: Given an integer N, return true if it is a palindrome else return false.

// A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

// Examples
// Example 1:
// Input:N = 4554
// Output:Palindrome Number
// Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
// Example 2:
// Input:N = 7789
// Output: Not Palindrome
// Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome

public class TUF_101 {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int temp = n;
        int rem,pal = 0;
        while(n!=0){
            rem = n%10;
            pal = (pal*10)+rem;
            n /= 10;
        }
        if(pal == temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 4554;
        System.out.println(num + " is a palindrome Number: "+ palindromeNumber(num));
    }
}
