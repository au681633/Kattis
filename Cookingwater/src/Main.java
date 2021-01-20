import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> largest = new ArrayList<>();
        boolean check = true;
        for(int i = 0; i < n; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            largest.add(max);
            for(int j = 0; j < largest.size(); j++) {
                if(largest.get(j) < min) {
                    check = false;
                }
            }

        }
        if(check) {
            System.out.println("gunilla has a point");
        } else {
            System.out.println("edward is right");
        }
    }
}