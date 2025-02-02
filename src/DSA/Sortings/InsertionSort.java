package DSA.Sortings;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int temp;
        int j;
        for(int i =1; i<arr.length; i++){
            temp = arr[i];
            j = i;
            while(j>0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 6,2,4,3};
        insertionSort(arr);

        // print
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
