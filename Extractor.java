public class Extractor{

    public static void main(String[] args) {
        String[] sampleNumbers = { "2351234567", "08067654321", "1234567890", "0812345678", "2359876543" };
        List filteredNumbers = filterNumbers(sampleNumbers);
        System.out.println("Valid phone numbers:");
        for (String number : filteredNumbers) {
            System.out.println(number);
        }
    }
}