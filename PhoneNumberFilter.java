
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
    // Nigeria phone number pattern
    private String allNetwork, mobilePattern,
            cdmaPattern, formatedNumbers, formatedNumbersPlus, spacePatterns;
    List<String> nigerianNumberPatterns;

    public PhoneNumberFilter() {
        nigerianNumberPatterns = new ArrayList<String>();
        this.numberPatterns = "^(0807|0812|0806|234806|\\+234806)\\d{8}$";
        // non-formated pattern
        this.allNetwork = "^(0803|0805|0802|0807|0806|0809|0801|0701|0703|0706|0708|0810|0811|0812|0813|0814|0815|0816|0817|0818|0909|0908|0902|0903|0905)\\d{7}$";
        nigerianNumberPatterns.add(allNetwork);
        // CDMA patterns
        this.mobilePattern = "/(0806|0803|0801|0703|0706|0702|0802|0805|0705|0809)\\d{7}/";
        nigerianNumberPatterns.add(mobilePattern);
        // international formated pattern
        this.cdmaPattern = "/^(234704|2347025|2347026|2347028|2347029|234819|234709|2347027|234707|2347023)\\d{6}$"; // CDMA
        nigerianNumberPatterns.add(cdmaPattern); // International
        // Pattern
        this.formatedNumbers = "/^(234803|234805|234802|234807|234806|234809|234801|234701|234703|234706|234708|234810|234811|234812|234813|234814|234815|234816|234817|234818|234909|234908|234902|234903|234905)\\d{7}$";
        nigerianNumberPatterns.add(formatedNumbers);
        this.formatedNumbersPlus = " /^\\+(234803|234805|234802|234807|234806|234809|234801|234701|234703|234706|234708|234810|234811|234812|234813|234814|234815|234816|234817|234818|234909|234908|234902|234903|234905)\\d{7}/";
        // Match Patterns
        nigerianNumberPatterns.add(formatedNumbersPlus);
        // this.spacedPatterns = "/\\+\\d{3} \\d{3} \\d{3} \\d{4}/"; // for matching
        // numbers spaced
        // nigerianNumberPatterns.add(spacePatterns);
    }

    public PhoneNumberFilter(String numberPatterns) {
        this.numberPatterns = numberPatterns;
    }

    public List<String> filterNumbers(String[] phoneNumbers) {
        List<String> results = new ArrayList<String>();
        for (String aPattern : nigerianNumberPatterns) {
            results.add(this.filterEngine(phoneNumbers, aPattern));
        }
        return results;
    }

    public List<String> filterNumbers(String[] phoneNumbers, String numberPatterns) {
        return this.filterEngine(phoneNumbers, numberPatterns);
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