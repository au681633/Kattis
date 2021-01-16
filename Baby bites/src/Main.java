import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        sc.nextLine();
        boolean bool = true;
        int counter = 0;
        for (int i = 0; i < d; i++) {
            String value = sc.next();
            if(value.equals(String.valueOf(counter+1)) || value.equals("mumble")) {
                counter++;
            } else {
                bool = false;
            }
        }
        if (bool) {
            System.out.println("makes sense");
        } else {
            System.out.println("something is fishy");
        }
    }
}