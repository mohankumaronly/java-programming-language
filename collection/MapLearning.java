package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String value = scanner.next();
            map.put(id, value);
        }

        // for (Map.Entry<Integer, String> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        ArrayList<String> list = new ArrayList<>();


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        for (String value : list) {
            System.out.println(value);
        }

        // map.put(scanner.nextInt(), scanner.next());
        // System.out.println(map);
        scanner.close();

    }
}
