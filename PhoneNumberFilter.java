
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFilter {
    private String numberPatterns;

    public PhoneNumberFilter() {
    }

    public PhoneNumberFilter(String numberPatterns) {
        this.numberPatterns = numberPatterns;
    }

    public List<String> filterNumbers(String[] phoneNumbers, String numberPatterns) {
        return this.filterEngine(phoneNumbers, numberPatterns);
    }

    public List<String> filterNumbers(String[] phoneNumbers) {
        return this.filterEngine(phoneNumbers, this.numberPatterns);
    }

    private List<String> filterEngine(String[] phoneNumbers, String patterns) {
        List<String> validNumbers = new ArrayList<>();
        Pattern compiledPattern = Pattern.compile(patterns);
        for (String phoneNumber : phoneNumbers) {
            Matcher matcher = compiledPattern.matcher(phoneNumber);
            if (matcher.matches()) {
                validNumbers.add(phoneNumber);
            }
        }

        return validNumbers;
    }
}