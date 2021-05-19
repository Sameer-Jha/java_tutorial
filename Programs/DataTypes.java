public class DataTypes {

    // Primary data types
    // ------- ---- -----

       static int i = 5;          // Integer
       static float f = 2.75f;    // Float
       static char c = 'a';       // Charachter
       static boolean b = true;   // Boolean

    // Secondary data types
    // --------- ---- -----

        static String s = "I'am a String";     // String: collection of charachters

        static String[] cars = {"ford", "maseratti", "pagani"};   // Arrays: to store multiple values in a single variable
        static int[] nums = {1, 53, 40};       // Arrays can be of various data types

    static class Example{      //  A Class is like an object constructor, or a "blueprint" for creating objects.

        int a = 5;                      // It can contain variables called attribute

        int example_module(int arg){    // It can contain function called methods
            System.out.println(arg);
            return 0;
        }
    }

    public static void main(String[] args){

        // Printing/Accesing the various datatypes

        System.out.println(i);
        System.out.println(f);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);

        for(int i = 0; i < cars.length; i++){
            System.out.print(cars[i].concat(" "));
        }

        System.out.println();

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }

        System.out.println();

        Example example = new Example();
        System.out.println(example.a);
        example.example_module(example.a);

    }
}
