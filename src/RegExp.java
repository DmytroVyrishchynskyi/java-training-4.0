import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    /**
     * Extracts the first valid IP address found in the given text.
     *
     * @param text text to parse
     * @return String with the first valid IP address or an empty string if none found
     */
    public static String getIpAddress(String text) {
        String ipPattern = "\\b((25[0-5]|2[0-4][0-9]|[0-1]?\\d{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?\\d{1,2})\\b";
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}
