import java.util.List;

/**
 * 
 * A Java Code for searching and filtering phone numbers starting with
 * 0807, 0812, 0806, 234806, +234806 and the length should be 11
 */

public class Extractor {

    public static void main(String[] args) {
        phoneNumbersExtractor();
        emailExtractor();
    }

    private static void phoneNumbersExtractor() {
        PhoneNumberFilter numberFilter = new PhoneNumberFilter("^(0807|0812|0806|234806|\\+234806)\\d{8}$");
        String[] sampleNumbers = { "2348061234567", "08067654321", "1234567890", "0812345678", "2359876543",
                "+23480687654321" }; // Added numbers for testing
        List<String> filteredNumbers = numberFilter.filterNumbers(sampleNumbers);

        System.out.println("Valid phone numbers:");
        for (String number : filteredNumbers) {
            System.out.println(number);
        }
    }

    private static void emailExtractor() {
        EmailFilter filter = new EmailFilter();
        String sampleText = "Contact us at support@example.com or sales@example.net for more information.";
        List<String> filteredEmails = filter.filterEmails(sampleText);

        System.out.println("Found emails:");
        for (String email : filteredEmails) {
            System.out.println(email);
        }
    }
}