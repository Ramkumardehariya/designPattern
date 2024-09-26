// package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Problem1 {
    public static void main(String[] args) {
        // String regex = "\\d+";
        // String regex = ".";
        // String regex = "^";
        // String regex = "t*";
        // String regex = "t+";
        // String regex = "i?";
        String regex = "\\d+";

        String input = "This is 123 and that is 456";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found a match: "+matcher.group());
        }

    }
}
