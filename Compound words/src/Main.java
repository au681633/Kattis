import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<>();
        while(sc.hasNextLine()) {
            while(sc.hasNext()) {
                arr.add(sc.next());
            }
            sc.nextLine();
        }
        System.out.println(arr);
    }
}