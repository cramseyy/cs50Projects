import java.util.Scanner;

public class encrypt {
    public static void main(String[] args) {

        if (args.length == 1) {
            for (int i = 0; i < args.length; i++) {
                boolean digit = isDigit(args[i]);
                if (!digit) {
                    System.out.println("Usage: java key. Not number");
                    System.exit(1);
                } else {
                    System.out.println("Correct");
                    System.exit(0);
                }
            }

        } else {
            System.out.println("Usage: java key");
            System.exit(1);
        }

    }

    public static boolean isDigit(String str) {

        boolean digit;
        int count = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        if (count == length) {
            digit = true;
        } else {
            digit = false;
        }
        return digit;
    }
}