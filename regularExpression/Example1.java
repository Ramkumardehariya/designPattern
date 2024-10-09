import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        String word = "9";
        String regex = "[a-zA-Z0-9]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

        System.out.println(matcher.matches());
    }
}
