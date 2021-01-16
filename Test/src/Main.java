import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long a = sc.nextLong(), b = sc.nextLong();
            // solve test case and output answer
            if (Math.pow(b/4, 2) >= a) {
                System.out.println("Diablo is happy!");
            } else {
                System.out.println("Need more materials!");
            }
        }
    }

}