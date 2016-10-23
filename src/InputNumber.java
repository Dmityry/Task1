import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dima on 22.10.2016.
 */
public class InputNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Please enter your phone number: ");

            try {
                String input = reader.readLine();
                Utils.assertNumberIsValid(input);

                long phoneNumber = Long.parseLong(input);
                int result = Utils.sumNumber(phoneNumber);
                String resultMessage = Utils.getResultMessage(result);
                System.out.println(String.format("Your result is: %s.", resultMessage));

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}