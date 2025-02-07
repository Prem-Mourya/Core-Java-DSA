package Metacube;

public class Sieve_prime_no {

    public static void prime(int N){
        int[] primeFlag = new int[N+1];

        // filling the primeFlag array with 1
        for(int i =2; i<N; i++){
            primeFlag[i] = 1;
        }

        // Updating the primFlag array with 0 on non-prime numbers
        for(int i = 2; i*i<=N; i++){
            if(primeFlag[i] == 1){
                for(int j = i * i; j<=N; j+=i){
                    primeFlag[j] =0;
                }
            }
        }
        // print
        for(int i =2; i<=N; i++){
            if(primeFlag[i] == 1)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int N = 100;
        prime(N);
    }
}
