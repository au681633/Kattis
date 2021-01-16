import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highscore = 0;
        List<Character> vowels = new ArrayList<>();
        Set<String> res = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        char[] temp = {'a'};
        while(temp[0] != '0') {
            temp = sc.next().toCharArray();
            int tempCounter = 0;
            for (int i = 0; i < temp.length-1; i++) {
                for (int j = 0; j < vowels.size()-1; j++) {
                    if(temp[i] == vowels.get(j) && temp[i+1] == vowels.get(j) ) {
                        tempCounter++;
                    }
                }
                if(highscore == tempCounter) {
                    res.add(String.valueOf(temp));
                } else if(highscore < tempCounter) {
                    res.clear();
                    res.add(String.valueOf(temp));
                }
                highscore = Math.max(tempCounter, highscore);
            }
        }
        res.forEach(v -> System.out.println(v));
    }
}