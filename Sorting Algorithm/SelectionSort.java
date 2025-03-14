public class SelectionSort{
    public static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7,3,8,5,1,9,4,2};
        System.out.println("Array:");
        printArray(arr);

        int smallest;

        for(int i =0; i<arr.length;i++){
            smallest = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]< arr[smallest]){
                    smallest = j;
                } 
            }
            int temp = arr[i];
            arr[i]= arr[smallest];
            arr[smallest] = temp;
        }
        System.out.println("Sorted Array:");

        printArray(arr);
    }
}