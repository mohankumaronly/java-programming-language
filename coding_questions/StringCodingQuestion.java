package coding_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCodingQuestion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        int maxLength = 0; 

        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String sub = "";
                for (int j2 = i; j2 <= j; j2++) {
                    sub = sub + input.charAt(j2);
                }

                // System.out.println(sub);

                ArrayList<Character> list = new ArrayList<>();
                boolean isDuplicate = false;

                for (int k = 0; k < sub.length(); k++) {
                    if (list.contains(sub.charAt(k))) { 
                        isDuplicate = true;
                        // return;
                        break;
                    }
                    list.add(sub.charAt(k));
                }

                if (!isDuplicate) {
                    if (sub.length() > maxLength) {
                        maxLength = sub.length();
                    }
                }
            }
        }
        
        System.out.println(maxLength);
        scanner.close();
    }
}
