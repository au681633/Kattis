import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();
        for (int d = 0; d < 5; d++) {
            String value = sc.next();
            char[] valueArr = value.toCharArray();
            for (int i = 0; i < valueArr.length-2; i++) {
                // shifting values to the left
                char a = valueArr[i];
                char b = valueArr[i+1];
                char c = valueArr[i+2];
                if(a == 'F' && b == 'B' && c == 'I') {
                    res.add(d+1);
                }
            }
            sc.nextLine();
        }
        if (res.size() <= 0) {
            System.out.println("HE GOT AWAY!");
        } else {
            res.forEach(v -> System.out.print(v + " "));
        }
    }
}