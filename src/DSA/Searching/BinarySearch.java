package DSA.Searching;

public class BinarySearch {

    public static int binarySearch(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start <= end){

            int mid = start + (end - start)/2;

            // addition condition to make code faster
            if(target == arr[start]){
                System.out.println("Faster cndtion1 executed");
                return start;
            }
            if(target == arr[end]){
                System.out.println("Faster cndtion2 executed");
                return end;
            }

            if(target == arr[mid]){
                System.out.println("Traditional cndition executed");
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    // Binary search implemention recursively

    public static int binarySearchRec(int arr[], int st, int end, int target){
        //base case
        if(st>end) return -1;

        int mid = st + (end - st)/2;
        if(target == arr[mid]) {
            return mid;
        }
        else if (target < arr[mid]) {

            return binarySearchRec(arr, st, mid-1, target);

        }
        else {
            return binarySearchRec(arr, st+1, end, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,7,15,20,24,45,50,77};
        int target = 2;
//        System.out.println(binarySearch(arr, target));
        // calling binary search recursion
        System.out.println(binarySearchRec(arr, 0, arr.length-1, target));
    }
}
