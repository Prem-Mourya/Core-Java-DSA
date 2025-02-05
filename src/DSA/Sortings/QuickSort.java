package DSA.Sortings;

public class QuickSort {

    // print
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }


    public static int partition(int[] arr, int low, int high){
        int pivot = arr[(low + high) /2];
        while(low <= high){
            while(arr[low] < pivot){
                low++;
            }
            while (arr[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    // recursion call
    public static void quikSortRecursion(int[] arr, int low,int high){
        int pi = partition(arr, low, high);

        if(low < pi-1){
            quikSortRecursion(arr, low, pi-1); // left side
        }
        if(pi < high){
            quikSortRecursion(arr, pi, high); // right side
        }
    }

    public static void main(String[] args) {
        int[] arr = {15,9,7,13,12,16,4,18,11};
        int n = arr.length;
        quikSortRecursion(arr, 0, n-1);
        print(arr);
    }
}
