import  org.junit.jupiter.api.Test;

        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class RegexTest {

    @Test
    void findAorS()
    {
        String str = "This is a book. a book.";

        Pattern pattern = Pattern.compile("[as]");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(),
                    str.substring(matcher.start(), matcher.end())));
        }

    }

    @Test
    void findAnyWord(){
        String str = "This$@@r@is%a^book.5345345a@book.";

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(), str.substring(matcher.start(), matcher.end())));
        }
    }

    @Test
    void findJustWord(){
        String str = "This is 11111 %%%%a book.5345345a book.";

        Pattern pattern = Pattern.compile("\\p{Alpha}+");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(), str.substring(matcher.start(), matcher.end())));
        }
    }

    @Test
    void findLowerWord(){
        String str = "This is 11111 %%%%a Book BOOk book.5345345a book.";

        Pattern pattern = Pattern.compile("\\p{javaLowerCase}+");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(), str.substring(matcher.start(), matcher.end())));
        }
    }

    @Test
    void findUpperWord(){
        String str = "This is 11111 %%%%a Book BOOk book.5345345a book.";

        Pattern pattern = Pattern.compile("\\p{Upper}+");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(), str.substring(matcher.start(), matcher.end())));
        }
    }

    @Test
    void findBlank(){
        String str = "This is 11111 %%%%a Book BOOk book.5345345a book.";

        Pattern pattern = Pattern.compile("\\p{Blank}+");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(), str.substring(matcher.start(), matcher.end())));
        }
    }

    @Test
    void findDigit(){
        String str = "This is 11111 %%%%a Book BOOk book.5345345a book.";

        Pattern pattern = Pattern.compile("\\p{Digit}+");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(), str.substring(matcher.start(), matcher.end())));
        }
    }

    @Test
    void findAlphaNumeric(){
        String str = "This $$$is@@@11111 %%%%a Book BOOk book.5345345a book.";

        Pattern pattern = Pattern.compile("\\p{Alnum}+");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(), str.substring(matcher.start(), matcher.end())));
        }
    }
}

