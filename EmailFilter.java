import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFilter {

    public EmailFilter(String email) {

    }

    public EmailFilter() {
    }

    public List<String> filterEmails(String text) {
        return this.filterEngine(text);
    }

    private List<String> filterEngine(String rawText) {
        List<String> emails = new ArrayList<>();
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+"); // Robust email pattern                                                                                                 
        Matcher matcher = emailPattern.matcher(rawText);
        while (matcher.find()) {
            String email = matcher.group();
            emails.add(email);
        }
        return emails;
    }

}