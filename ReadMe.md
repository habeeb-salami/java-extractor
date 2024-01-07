# Java Extractor
Is a Java Code for extracting Email, and phone Numbers from text, files, etc.
Explanation:

- The code defines a PhoneNumberFilter class with a filterNumbers method that takes an array of phone numbers as input and returns a list of valid phone numbers.

- We define a regular expression pattern ^(235|0806)\d{8}$. This pattern matches strings that start with either "235" or "0806", followed by eight digits.

- We compile the pattern using Pattern.compile(pattern).

- We iterate over the input phone numbers and create a Matcherobject for each number using the compiled pattern.

- We call the matcher.matches()method to check if the phone number matches the pattern. If it does, we add it to the validNumbers list.

- Finally, the main method demonstrates how to use the filterNumbers method with sample phone numbers and prints the filtered list.

This code provides a basic example of searching and filtering phone numbers based on specific criteria. You can further refine the code by:

=> Adding more patterns for other valid Nigerian phone number prefixes.
=> Implementing additional validation checks, such as verifying the country code (e.g., +234).
=> Handling invalid phone numbers gracefully by providing informative error messages.

Remember, it's important to use phone number filtering in a responsible and ethical manner, avoiding discrimination or targeting based on sensitive attributes.
## License
This license is licensed under the MIT license
## Email Extractor
This Code can extract phone numbers from files, webpages, etc. from

