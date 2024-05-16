import java.util.Scanner;

public class encrypt {
    public static void main(String[] args){

        if(args.length == 1){
            System.out.println("Correct");
        } else {
            System.out.println("Usage: java key");
            System.exit(0);
        }

    }
}