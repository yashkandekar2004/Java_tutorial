import java.util.regex.*;

public class regex {
    public static void main(String[] args) {
        String email = "user@example.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        boolean isValid = Pattern.matches(regex, email);

        System.out.println(isValid ? "Valid Email" : "Invalid Email");
    }
}
