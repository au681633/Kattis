import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int won = 0;

        for(int i = 0; i < n; i++) {
            char[] temp = sc.next().toCharArray();
            sc.nextLine();
            boolean hasWon = true;
            for(int j = 1; j < temp.length; j++) {
                if(temp[j-1] == 'C' && temp[j] == 'D') {
                    hasWon = false;
                }
            }
            if(hasWon) {
                won++;
            }
        }
        System.out.println(won);
    }
}