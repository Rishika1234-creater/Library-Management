import java.util.Scanner;

public class Utils {
    public static int getIntInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    public static String getStringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
}

