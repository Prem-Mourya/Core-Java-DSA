package DSA.Recursion;

public class FibonachiSeries {

    public static void printFib(int a, int b, int n){

        if(n==0) return;

        // work
        int c = a + b; // next term
        System.out.print(c + " ");
        printFib(b, c, n-1);
    }

    public static void main(String[] args) {
        int a = 0, b =1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int n =10;
        printFib(a, b , n-2);
    }
}
