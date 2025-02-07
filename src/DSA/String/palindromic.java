package DSA.String;
import java.util.*;

public class palindromic {

    // Palindrom or not
    public static boolean isPalindrome(String str){
        int i =0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    // Count of palindrome substrings
    public static int countPalindromeSubstring(String str){
        int count =0;
        for(int i = 0; i<str.length(); i++){
            for(int j =i+1; j<=str.length(); j++){
               if(isPalindrome(str.substring(i,j)) == true) {
                   count++;
               }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abc";
        int count = countPalindromeSubstring(str);
        System.out.println(count);
    }
}
