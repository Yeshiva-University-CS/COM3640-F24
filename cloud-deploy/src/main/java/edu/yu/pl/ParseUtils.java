package edu.yu.pl;

public class ParseUtils {

    public static String extractStringLiteral(String input) {
        if (input == null) {
            return null;
        }
        int start = input.indexOf("\"");
        if (start == -1) {
            return null;
        }
        int end = input.indexOf("\"", start + 1);
        if (end == -1) {
            return null;
        }
        return input.substring(start + 1, end);
    }
    
}
