import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PinCodeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pin Code validation
        System.out.println("Enter the Pin Code ");
        String pinCode= sc.next();
        String pinCodeRegex="^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
        Pattern pattern3=Pattern.compile(pinCodeRegex);
        Matcher matcher3=pattern3.matcher(pinCode);
        if(pinCode.equals(pinCodeRegex)){
            System.out.println("Entered Pin Code is "+matcher3.matches());
        }else{
            System.out.println("Pin Code is not valid ");
        }

    }
}
