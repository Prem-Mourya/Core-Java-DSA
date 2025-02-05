package DSA.String;
import java.util.*;
public class SubString {

    // substring problem
    public static void substring(String str, int n){
        for(int i =0; i<=n; i++){
            for(int j = i+1; j<=n; j++){
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "prem";
        int n = str.length();
        substring(str,n);

    }
}
