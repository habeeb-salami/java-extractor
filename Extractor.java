import java.util.List;

/**
 * 
 * A Java Code for searching and filtering phone numbers starting with
 * 0807, 0812, 0806, 234806, +234806 and the length should be 11
 */

public class Extractor {

    public static void main(String[] args) {
        PhoneNumberFilter numberFilter = new PhoneNumberFilter();
        String[] sampleNumbers = { "2351234567", "08067654321", "1234567890", "0812345678", "2359876543" };
        List filteredNumbers = numberFilter.filterNumbers(sampleNumbers);
        System.out.println("Valid phone numbers:");
        for (String number : filteredNumbers) {
            System.out.println(number);
        }
    }
}