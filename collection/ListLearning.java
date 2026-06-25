package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListLearning {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // int[] array = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println(list.get(0));

        list.set(3, 4);
        list.set(4, 5);

       System.out.println(list.contains(6));
       
    //    System.out.println();

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        
        list.remove(3);
        
        for (Integer integer : list) {
            System.out.println(integer + " ");
        }

        System.out.println("--------------");
        System.out.println(list.indexOf(2));
        System.out.println(list.isEmpty());
        list.add(3, 10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        list.remove(Integer.valueOf(3));
        System.out.println("----------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        scanner.close();
    }
}
