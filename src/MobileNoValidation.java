import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // mobile No. validation
        System.out.println("Enter the mobile no. ");
        String mobileNo= sc.next();
        String mobileRegex="^(91)?[6-9][0-9]{9}";
        Pattern pattern2=Pattern.compile(mobileRegex);
        Matcher matcher2=pattern2.matcher(mobileNo);
        if(mobileNo.equals(mobileRegex)){
            System.out.println("Entered mobile no. is "+matcher2.matches());
        }else{
            System.out.println("Mobile no. is not valid ");
        }
    }
}
