import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        if(n <= k) {
            System.out.println("too late");
        } else {
            for(int i = 0; i < k; i++) {
                sc.nextLine();
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            int l = 1;
            boolean stop = false;
            int j = 0;
            for(j = 0; j < arr.size(); j++) {
                if(arr.get(j) != l && !stop) {
                    System.out.println(l);
                    stop = true;
                } else {
                    l++;
                }
            }
            if(arr.isEmpty()) {
                System.out.println("1");
            }
        }
    }
}