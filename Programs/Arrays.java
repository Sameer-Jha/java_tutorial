import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        
        int[] arr = {15, 61, 17};  // This is how an array is declared

        // Printing an array using for loop
        System.out.println("The numbers in array arr are: ");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        System.out.println("\n");

        // now scan array elements from the cli
        Scanner in = new Scanner(System.in);

        System.out.print("Size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter elements: ");
        int[] array = new int[n]; //declaring array of length n

        for(int i=0; i<n; i++){
            array[i] = in.nextInt();
        }

        System.out.println();
        System.out.println("Printing the scanned array");
        for(int i = 0; i<n; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
