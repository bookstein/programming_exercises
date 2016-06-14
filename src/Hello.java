import java.io.Console;

public class Hello {

    public static void main(String args[]) {
        // print prompt to terminal
        // get input from terminal
        // call method with input that prints to terminal
        System.out.println(getHelloString(getName(System.console())));
    }

    public static String getName(Console c) {
        return c.readLine("What is your name? ");
    }

    public static String getHelloString(String name) {
        return "Hello " + name + " nice to meet you!!!!!!!";
    }
}
