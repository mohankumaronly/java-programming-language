package coding_questions;

import java.util.Scanner;

public class PalindromeSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Print the all the possible sub array here");

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length - i; j++) {
                int end = i + j - 1;
                if(isPalindrome(arr, j, end)){
                    for (int j2 = j; j2 <= end; j2++) {
                        System.out.print(arr[j2] + " ");
                    }
                    System.out.println();
                }
            }
        }
        scanner.close();
    }

    private static boolean isPalindrome(int[] arr, int j, int end){
        while (j < end) {
            if(arr[j] != arr[end]){
                return false;
            }
            j++;
            end--;
        }

        return true;
    }

}
