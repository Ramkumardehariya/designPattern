import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {

    static void checkStringAgainstRE(String regex, String str){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        boolean matches = matcher.matches();

        System.out.println("The matches is: "+matches);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a regular expression: ");
            String regex = sc.nextLine();
    
            System.out.println("Enter a string for checking regular expression : ");
            String str = sc.nextLine();
    
            checkStringAgainstRE(regex, str);

            System.out.println("If you want to exit then click [y/n]: ");
            String ch = sc.nextLine();

            if(ch.equalsIgnoreCase("y")){
                System.out.println("Thank you for using this app");
                break;
            }
        }

    }
}
