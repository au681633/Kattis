import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aArray = a.toCharArray();
        List<Character> res = new ArrayList<>();
        for (int i = 0; i < aArray.length-1; i++) {
            if(aArray[i] != aArray[i+1]) {
                res.add(aArray[i]);
            }
        }
        res.add(aArray[aArray.length-1]);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}