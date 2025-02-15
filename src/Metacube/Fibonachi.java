package Metacube;

public class Fibonachi {

    public static void main(String[] args) {
        int n = 10;
        int firstNum = 0, secondNum = 1;
        for(int i =1; i<=n; i++){
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
