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

    public static String userInput1()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Last Name : ");
        String b2 = s.nextLine();
        return b2;
    }

    public static String userInput2()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String b3 = s.nextLine();
        return b3;
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

        boolean lname = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*",UserRegister.userInput1());
        System.out.println(fname);
        if(lname == false) {
            System.out.println("Invalid Name,Try Again!");
            boolean nlname = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*",UserRegister.userInput1());
            System.out.println(nlname);
        }
        boolean email = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}",UserRegister.userInput2());
        System.out.println(email);
        if(email == false) {
            System.out.println("Invalid Name,Try Again!");
            boolean nemail = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}",UserRegister.userInput2());
            System.out.println(nemail);
        }
    }
}
