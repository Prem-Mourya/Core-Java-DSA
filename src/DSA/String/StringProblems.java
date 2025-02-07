package DSA.String;
import java.util.*;
public class StringProblems {
    public static void main(String[] args) {
        // capital to small and small to capital
        StringBuilder str = new StringBuilder("PHysiCS walLha");

        // toggle char and changing it from capital to small and small to capital
        for(int i =0; i<str.length(); i++){
            boolean flag = true; // capital
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int asciValue = (int)ch;
            if(asciValue>=97) flag = false; // small
            if(flag == true){
                asciValue += 32;
                char dh = (char)asciValue;
                // change the char
                str.setCharAt(i,dh);
            }else{
                asciValue -= 32;
                char dh = (char)asciValue;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
