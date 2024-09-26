// package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {

        //gredyQuantifiers
        String text = "aaaa";
        Pattern gredyQuantifiers = Pattern.compile("a+");
        Matcher greedymatcher = gredyQuantifiers.matcher(text);

        while (greedymatcher.find()) {
            System.out.println("Greedy Quantifier: "+greedymatcher.group());
        }

        //relunctQuantifier
        Pattern relunctQuantifier = Pattern.compile("a+?");
        Matcher reluncatMatcher = relunctQuantifier.matcher(text);

        while (reluncatMatcher.find()) {
            System.out.println("relunctQuantier : "+reluncatMatcher.find());
        }

        //possesive quantifier
        Pattern possesiveQuantifier = Pattern.compile("a*+");
        Matcher possesiveMatcher = possesiveQuantifier.matcher(text);

        while (possesiveMatcher.find()) {
            System.out.println("possesive Matcher: "+possesiveMatcher.group());
        }

    }
}
