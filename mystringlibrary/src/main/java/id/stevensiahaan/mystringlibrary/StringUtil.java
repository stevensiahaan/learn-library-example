package id.stevensiahaan.mystringlibrary;

public class StringUtil {

    public String reverse(String input) {
        StringBuilder output = new StringBuilder(input);
        return output.reverse().toString();
    }

}
