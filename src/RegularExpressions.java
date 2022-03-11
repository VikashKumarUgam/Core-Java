import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        //Challenge 1: Write a string literal regular expression that will match the String: I want a bike. Use the string.matches() method to verify
        String challenge1= "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));
        // Challenge 2: Write a regular expression that will match "I want a bike." and "I want a ball." Use matches method
        String challenge2= "I want a ball.";
        System.out.println(challenge2.matches("I want a \\w+."));
        System.out.println(challenge1.matches("I want a \\w+."));
        System.out.println(challenge2.matches("I want a (bike|ball)."));
        //Challenge 3: Use Matcher.matches() method for the above pattern.
        Pattern pattern = Pattern.compile("I want a (bike|ball).");
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        //Challenge 4: Replace all occurences of blank with an underscore for the following String.

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ","_"));
        System.out.println(challenge4.replaceAll("\\s","_"));

        //Challenge 5: Write Regular Expression that will match the following String in its entirety . Use String.matches() method

        String challenge5= "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        // Challenge 6: Write Regular Expression that will only match the challenge5 string in its entirety.
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));


        //Challenge 7: Write a regular Expression that starts with a series of letters.The letters must be followed by a
        // period. After the period, there must be a series of digits. The string "kjisl.22" would match. THe string
        // "f5.12a" would not. Use this string to test your expression

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

        //Challenge 8: Modify the above regular Expression to use a group , so that we can print all the digits that
        // occur in a string that contains multiple occurrences of the pattern. Write all the code required to
        // accomplish this(create a pattern and matcher)

        String challenge8 ="abcd.135.uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()){
            System.out.println("Occurrence: "+matcher8.group(1));
        }

        //Challenge 9: Modify the above expression for the string "abcd.135\tuvqz.7\ttzik.999\n"
        String challenge9="abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()){
            System.out.println("Occurence: "+ matcher9.group(1));
        }

        //Challenge 10: Modify the above expression to print the start and end indices instead of the digits
        String challenge10="abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge9);
        while(matcher10.find()){
            System.out.println("Occurence: "+ matcher10.start(1)+ " end = "+ (matcher10.end(1)-1));
        }

        //Challenge 11: Extract data from the curly braces for the below String

        String challenge11="{0,2},{1,5},{2,3}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()){
            System.out.println("Occurences: "+ matcher11.group(1));
        }

        //Regular Expression that will match 5-digit US Zip code and 4-digit optional zip code preceded by a dash\
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));


    }
}
