package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashProblemSolving {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        String[] names = {
                "Mohan", "Rahul", "Mohan", "Anil", "Rahul",
                "Kumar", "Mohan", "Anil", "Ravi", "Kumar",
                "Ravi", "Rahul", "Mohan", "Ajay", "Ajay"
        };

        int[] marks = {
                90, 80, 95, 70, 85,
                60, 88, 91, 99, 76,
                75, 92, 87, 65, 78
        };

        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i] + " -> " + marks[i]);
        // }

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < marks.length; i++) {
            if(!map.containsKey(names[i])){
                map.put(names[i], 1);
            }else{
                int count = map.get(names[i]);
                count++;
                map.put(names[i], count);
                
            }

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        Scanner.close();
    }
}
