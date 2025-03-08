import java.util.Scanner;


public class BinarySearchIterative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = {2,3,5,6,8,9,11,13,14,15};

        System.out.println("Enter the number you want to find in an array: ");
        int target = scan.nextInt();

        int start = 0;
        int mid;
        int end  = arr.length-1;
        boolean find = false;

        while(start<=end){
            mid = start + (end - start)/2;
            if(arr[mid] == target){
            find = true;
            System.out.println("Target found at " + mid);
            break;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }

        if(find == false){
            System.out.println(target + " Not found in an array");
        }
    }
}
