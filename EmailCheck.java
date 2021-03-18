import java.util.Scanner;
import java.util.regex.Pattern;


public class EmailCheck {

    public static void emailValidate() {
        System.out.println("Email Validation");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter Email: ");
        String email = scan.nextLine();
        System.out.println(email);
        String expression = "^[a-zA-Z0-9]*";
        String Email = (Pattern.matches(expression, email)) ? "Successfully Valid" : "Invalid";
	System.out.println("Email " + Email + " ");
    }
	public static void main(String[] args) {
		emailValidate();
	}
}
