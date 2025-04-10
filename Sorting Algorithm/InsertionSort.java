public class InsertionSort{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,9,1,8,4,5,2,6};
        System.out.println("Array: ");
        printArray(arr);


        for(int i = 1; i<arr.length; i++){
           int current = arr[i];
           int j = i-1;
           while(j>=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
           }
           arr[j+1] = current;
        }
        System.out.println("Sorted Array: ");
        printArray(arr);

    }
}