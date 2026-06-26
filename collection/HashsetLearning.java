package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HashsetLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            treeSet.add(scanner.nextInt());
        }

        treeSet.descendingSet();

        System.out.println(treeSet);

        Collections.reverseOrder();

        System.out.print(treeSet);




        scanner.close();
    }
}
