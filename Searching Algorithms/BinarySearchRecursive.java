import java.util.Scanner;

public class BinarySearchRecursive {

   public  int binarySearch(int[] arr, int target, int start, int end){

        if(start>end){
            return -1;
        }   
            int mid = start + (end - start)/2;
        
        if(arr[mid] == target){
        return mid;

        }
        else if(target < arr[mid]){
            return binarySearch(arr, target, start, mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1, end);
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = {2,3,5,6,8,9,11,13,14,15};
        int start = 0;
        int end  = arr.length-1;


        System.out.println("Enter the number you want to find in an array: ");
        int target = scan.nextInt();

        BinarySearchRecursive binary = new BinarySearchRecursive();
        int result = binary.binarySearch(arr, target, start, end );

        if(result != -1){
            System.out.println("Target value " + target + " found at: " + result);
        }

        else{
            System.out.println(target + " Not found in an array");

        }
    }
}
