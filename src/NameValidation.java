import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//First Name Validation
        System.out.println("Enter the first Name: ");
        String firstName = sc.next();
        String regex = "^[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (firstName.length() >= 3) {
            System.out.println("First name is " + matcher.matches());
        } else {
            System.out.println("Name is not valid");
        }
        System.out.println("Enter the last Name: ");
// Last Name validation
        String lastName = sc.next();
        if (lastName.length() >= 3) {
            System.out.println("Last name is " + pattern.matcher(lastName).matches());
        } else {
            System.out.println("Last name is not valid");
        }
    }
}
