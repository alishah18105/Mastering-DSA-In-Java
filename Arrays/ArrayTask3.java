import java.util.Scanner;

public class ArrayTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] num = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i =0; i<num.length; i++ ) {
            sum+=num[i];
            
        }
        
        System.out.println("Sum Of All Numbers: "+sum);
        scanner.close();
    }
}