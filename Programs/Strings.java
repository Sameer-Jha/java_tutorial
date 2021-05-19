import java.util.Scanner;

public class Strings {

    static String upper(String s){
        return s.toUpperCase();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = in.nextLine();

        System.out.println("You entered : "+s);

        System.out.println(upper(s));

    }    
}
