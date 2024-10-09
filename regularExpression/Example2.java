import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

    static void checkStringAgainstRE(String regex, String str){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        boolean matches = matcher.matches();

        System.out.println("The matches is: "+matches);
    }
    public static void main(String[] args) {
        //1. Create Regular expression that accept alphanumeric characters only.
        String regex = "[a-zA-Z0-9#]+";
        String str = "RamkumarDehariya12#";


        //2. Create Regular expression that accept 10 digit number only
        regex = "[0-9]{10}";
        str = "9424328741";

        //3. Write a Regular Expression to match email addresses
        regex = "^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+.[a-zA-Z]{2,}$";
        str = "ramkumardehariya26@gmail.com";

        //4. write a Regular Expression for matching username that contain numbers, letters and @,$only
        regex = "^[a-zA-Z0-9@$]+$";
        str = "Ramkumar123@$";


        checkStringAgainstRE(regex, str);
    }
}
