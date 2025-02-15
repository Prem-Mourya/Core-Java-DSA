package DSA.Recursion;

public class RecursionOneShot {

//    print n number
    public static void printNum(int n){
        if(n == 0) return;
        printNum(n-1);
        System.out.print(n + " ");
    }

    // print sum of n natural number
    public static void printSum(long i, long n, long sum){

        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        // work
        sum += i;
        printSum(i+1, n, sum);
    }

    // print factorial of n
    public static int printFactorial(int n){

        if(n == 0) return 1;
        // work
        return n * printFactorial(n-1);
    }

    // power of x^n
    public static int calPow(int x, int n){

        if(n == 0) return 1;
        if(x == 0) return 0;
        int xPownm1 = calPow(x, n-1);
        int xpow = x * xPownm1;
        return xpow;
    }
    public static void main(String[] args) {

        int ans = calPow(2, 5);
        System.out.println(ans);
    }
}
