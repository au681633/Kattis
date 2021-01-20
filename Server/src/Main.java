import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            if (sum <= T) {
                res++;
            }
        }
        System.out.println(res);
    }
}