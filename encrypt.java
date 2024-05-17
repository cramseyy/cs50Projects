import java.util.Scanner;

public class encrypt {
    public static void main(String[] args) {

        if (args.length == 1) {

            boolean digit = isDigit(args[0]);
            if (!digit) {
                System.out.println("Usage: java key. Not number");
                System.exit(1);
            } else {
                int num = Integer.parseInt(args[0]);
                Scanner ptInput = new Scanner(System.in);
                System.out.print("plaintext: ");
                String pt = ptInput.next();

                char ct;
                System.out.print("ciphertext: ");
                for (int i = 0; i < pt.length(); i++) {
                    ct = rotate(pt.charAt(i), num);
                    System.out.print(ct);
                }
                System.out.println();

                ptInput.close();
                System.exit(0);
            }
        }

        else {
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