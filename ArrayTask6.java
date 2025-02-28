import java.util.Scanner;

public class ArrayTask6 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        int[][] matrix = new int[rows][columns];
        
        for(int i=0; i<rows; i++){
            System.out.println("Enter the number of Row: "+ (i+1));
            for(int j=0; j<columns; j++){
            System.out.println("Enter the number of Column: "+ (j+1));
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }  
        scanner.close();
        
}
}