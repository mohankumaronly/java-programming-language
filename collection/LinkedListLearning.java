package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListLearning {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.addLast(6);
        list.addFirst(10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        scanner.close();
        
    }
}


