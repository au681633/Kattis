import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean yes = false;
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            if (sum > w) {
                yes = false;
            } else if (sum == w) {
                yes = true;
                sum = 0;
            }
        }
        if(yes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}