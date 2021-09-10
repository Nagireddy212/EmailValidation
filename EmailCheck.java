import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailCheck {

    public static void emailValidate() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Email: ");
        String email = scan.nextLine();
        System.out.println(email);
        String expression = "^[\\u0E00-\\u0E7Fa-zA-Z0-9]+([.+_-]{0,1}+[\\u0E00-\\u0E7Fa-zA-Z0-9])*+[@]+[\\u0E00-\\u0E7Fa-zA-Z-]+[.]+[\\u0E00-\\u0E7Fa-zA-Z]{2,30}+([.]{1}+[\\u0E00-\\u0E7Fa-zA-z]{0,10})*";
        String result = (Pattern.matches(expression, email)) ? "Successfully Valid" : "Invalid";
        System.out.println("Email " + result + " ");
    }
    public static void main(String[] args) {
        emailValidate();
    }
}
