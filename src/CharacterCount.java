import java.io.Console;

public class CharacterCount {
    public static void main (String args[]) {
        Console c = System.console();

        String input = c.readLine("What is the input string? ");

        while (input.length() == 0) {
            input = c.readLine("You MUST enter a value. What is the input string? ");
        }

        System.out.println(input + " has " + input.length() + " characters.");
    }
}
