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
                    int num = Integer.parseInt(args[0]);
                    Scanner ptInput = new Scanner(System.in);
                    String pt = ptInput.nextLine();
                    System.out.println(args[0]);
                    
                    System.out.println(rotate(pt.charAt(pt.length() - 1),5));

                    System.out.println("Correct");
                    System.exit(0);
                }
            }

        } else {
            System.out.println("Usage: java key. Too many args");
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

    public static char rotate(char c, int n) {

        char newChar = c;

        if (!Character.isAlphabetic(c)) {
            return c;
        } else if ((int) newChar >= 65 && (int) newChar <= 90) {
            newChar -= 65;
            newChar = (char) ((newChar + n) % 26);
            newChar += 65;
        } else if ((int) newChar >= 97 && (int) newChar <= 122) {
            newChar -= 97;
            newChar = (char) ((newChar + n) % 26);
            newChar += 97;
        }
        return newChar;

    }
}