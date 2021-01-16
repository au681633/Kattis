import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.next();
            sc.nextLine();
            String b = sc.next();
            // solve test case and output answer
            if (a.length() >= b.length()) {
                System.out.println("go");
            } else {
                System.out.println("no");
            }
        }
    }

}