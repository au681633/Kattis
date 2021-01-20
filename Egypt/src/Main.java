import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        List<Integer> arr = new ArrayList<>();
        while(temp != 0) {
                arr = new ArrayList<>();
                temp = sc.nextInt();
                arr.add(temp);
                arr.add(sc.nextInt());
                arr.add(sc.nextInt());
                Collections.sort(arr);
                if(arr.get(0) != 0 && arr.get(1) != 0 && arr.get(2) != 0) {
                    if(Math.pow(arr.get(0), 2)+Math.pow(arr.get(1),2) == Math.pow(arr.get(2),2)) {
                        System.out.println("right");
                    } else {
                        System.out.println("wrong");
                    }
                }
            sc.nextLine();
        }
    }
}