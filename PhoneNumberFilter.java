
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFilter {
    public static List filterNumbers(String[] phoneNumbers) {
        List validNumbers = new ArrayList<>();
        String pattern = "^(235|0806)\\d{8}$"; // Regex pattern for matching desired format
        Pattern compiledPattern = Pattern.compile(pattern);
        for (String phoneNumber : phoneNumbers) {
            Matcher matcher = compiledPattern.matcher(phoneNumber);
            if (matcher.matches()) {
                validNumbers.add(phoneNumber);
            }
        }
        return validNumbers;
    }
}