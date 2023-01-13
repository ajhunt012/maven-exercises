// import org.apache.commons.lang3.StringUtils;
        import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String input = scanner.nextLine();
        System.out.println("You Entered: \"" + input + "\"");

//        if (StringUtils.isNumeric(input)) {
//            System.out.println("\"" + input + "\" is a number");
//        } else {
//            System.out.println("\"" + input + "\" is not a number");
//        }
//
//        String flippedCase = StringUtils.swapCase(input);
//        System.out.println("Flipped Case: " + flippedCase);
//
//        String reversed = StringUtils.reverse(input);
//        System.out.println("Reversed: " + reversed);
    }
}
