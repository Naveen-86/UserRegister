package assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegister {

    public static String userInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String b1 = s.nextLine();
        return b1;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        boolean fname = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*",UserRegister.userInput());
        System.out.println(fname);
        if(fname == false) {
            System.out.println("Invalid Name,Try Again!");
            boolean nfname = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*",UserRegister.userInput());
            System.out.println(nfname);
        }
    }
}
