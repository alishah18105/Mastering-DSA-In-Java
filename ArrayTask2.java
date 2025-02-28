import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] num = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        
        System.out.println("Array Elements:");
        for (int i =0; i<num.length; i++ ) {
            System.out.println(num[i]);
            
            
            
        }
        scanner.close();
    }
}