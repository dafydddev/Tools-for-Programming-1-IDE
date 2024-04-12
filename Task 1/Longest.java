import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No parameters");
        }
        else {
            String longest = "";
            for (String arg : args) {
                if (arg.length() > longest.length()) {
                    longest = arg;
                }
            }
            System.out.printf("Longest parameter: %s%n", longest);
        }
    }
}
