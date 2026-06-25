package collection;
import java.util.Scanner;

public class ArralistProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[26];
        String input = scanner.next();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if(count[i] != 0){
                System.out.println((char) ('a' + i) + " -> " + count[i]);
            }
        }
        
        scanner.close();

    }
}
