import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailCheck {

    public static void emailValidate() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Email: ");
        String email = scan.nextLine();
        System.out.println(email);
        String expression = "^[a-zA-Z0-9]+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}";
        String result = (Pattern.matches(expression, email)) ? "Successfully Valid" : "Invalid";
        System.out.println("Email " + result + " ");
    }
    public static void main(String[] args) {
        emailValidate();
    }
}
