package DSA.Sortings;

public class MergeSort {

    static void printArr(int[] arr){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void merge(int[] arr, int l, int mid, int r){

        // length for left and right sub-arrays
        int n1 = mid-l+1;
        int n2 = r-mid;

        // creating left and right sub-arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // filling left and right sub-arrays
        int i,j,k;
        for(i =0; i<n1; i++) left[i] = arr[l+i];
        for(j =0; j<n2; j++) right[j] = arr[mid + 1 +j];

        // overriding and sorting the sub-arrays to main array.
        i =0; j=0; k=l;
        while (i<n1 && j<n2){
            if (left[i] <= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        // copying the remaining elements form left or right array to main array.
        while(i<n1){
            arr[k++] = left[i++];
        }
        while (j<n2) {
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int[] arr, int l, int r){
        if(l>=r) return;
        int mid = l + (r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }



    public static void main(String[] args) {
        int[] arr = {48,38,13,52,19,21};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        printArr(arr);
    }
}
