import java.util.regex.Pattern;

public class Utils {

    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^[\\d]{10}$");

    public static void assertNumberIsValid(String number) throws Exception {
        if (number.length() != 10)
            throw new Exception(String.format("Phone number is too %s.", number.length() < 10 ? "small" : "long"));

        if (!PHONE_NUMBER_PATTERN.matcher(number).matches())
            throw new Exception("Phone number is incorrect. Please try again.");
    }

    public static int sumNumber(long number) {
        int result = 0;

        do {
            result += number % 10;
            number /= 10;
        } while (number > 0);

        return (result) < 10 ? result : sumNumber(result);
    }

    public static String getResultMessage(int res) {
        switch (res) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Cannot calculate phone number.";
        }
    }
}
