import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] num = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        
        int min = num[0];
        int max = num[0];
        
        for(int i = 1; i<num.length; i++){
            if(num[i]<min){
                min = num[i];
            }
            
            if(num[i]>max){
                max = num[i];
            }
        }
        
        
        System.out.println("Maximum Number Of The Array: "+max);
        System.out.println("Minimum Number Of The Array: "+min);

        scanner.close();
    }
}