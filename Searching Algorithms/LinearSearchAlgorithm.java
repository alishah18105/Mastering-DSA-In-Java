import java.util.Scanner;

public class LinearSearchAlgorithm{
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,7,8,3,9,4};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to search in an array:");
        int target = input.nextInt();

        boolean find = false;
        for(int i =0; i<arr.length; i++){

            if(target == arr[i]){
                System.out.println("Target Value " + target + " is found at index: "+ i);
                find = true;
                break;
            }
        }
        if(find == false){
            System.out.println("Target value " + target + " 13is not found");
        }
        input.close();
    }
    
}