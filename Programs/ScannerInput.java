// Scanner class is used for taking console input in Java.

import java.util.Scanner; // This is how it is imported.

public class ScannerInput {

        public static void main(String[] args){

        Scanner in = new Scanner(System.in);  // This is how an object for Scanner class is created.

        System.out.print("Enter integer: ");
        int i = in.nextInt();  // nextInt is used to take integer input
        in.nextLine();
        System.out.format("You entered %d \n",i);

        System.out.println();

        System.out.print("Enter float: ");
        float f = in.nextFloat();  // nextFloat is used to take float input
        in.nextLine();
        System.out.format("You entered %.3f \n", f);

        System.out.println();

        System.out.print("Enter a string: ");  
        String str= in.nextLine();              //reads string   
        System.out.println("You have entered: "+str);

    }
    
}
