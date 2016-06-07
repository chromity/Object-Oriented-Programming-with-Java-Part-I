
public class StringUtils {
    public static boolean included(String word, String searched) {
        
        if (word == null|| searched == null) {
            return false;
        }
        
        return ((word.trim()).toUpperCase().contains((searched.trim().toUpperCase())));
        // trims the word and the searched then turns in to uppercase then checks if word contains searched
    }
}
