import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Email validation
        System.out.println("Enter the Email ");
        String email = sc.next();
        //String emailRegex = "^(.+)@(.+)$";
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern1 = Pattern.compile(emailRegex);
        Matcher matcher1 = pattern1.matcher(email);
        if (email.matches(emailRegex)) {
            System.out.println("Entered Email is : " + matcher1.matches());
        } else {
            System.out.println("Email is not valid !"+ "Please enter the valid email");
        }
    }
}
