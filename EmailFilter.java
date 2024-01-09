import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFilter {

    public List<String> filterEmails(String text) {
        List<String> emails = new ArrayList<>();
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+"); // Robust email pattern
        Matcher matcher = emailPattern.matcher(text);

        while (matcher.find()) {
            String email = matcher.group();
            emails.add(email);
        }

        return emails;
    }

   
}