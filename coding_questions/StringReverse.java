package coding_questions;

import java.util.Scanner;

class StringReverse {
    public static void main(String[] aStrings) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        anagram(input1,input2);
        scanner.close();
    }

    // finding the second Laregest Element
    public static int isSecondLargestElement(int[] array) {
        int secondLargest = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                secondLargest = maxElement;
                maxElement = array[i];
            } else if (secondLargest < array[i] && secondLargest != maxElement) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    // Remove duplicates in the array
    public static void removeDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicates = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicates = true;
                    break;
                }
            }
            if ((!isDuplicates)) {
                System.out.println(array[i]);
            }
        }
    }

    // problem on the Fizz buzz
    public static void pringFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // find the the number is prime or not
    public static boolean isPrime(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    // fabonacci series
    public static void printFebonacciSeries(int number) {
        if (number == 0) {
            return;
        } else if (number == 1) {
            System.out.println(0);
        } else {
            int first = 0;
            int second = 1;
            System.out.println(first);
            System.out.println(second);

            for (int i = 2; i < number; i++) {
                int next = first + second;
                System.out.println(next);
                first = second;
                second = next;
            }
        }
    }

    public static boolean anagram(String str1, String str2){

        int[] count = new int[26];

        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < count.length; i++){
            System.out.println((char)('a' + i) + " -> " + count[i]);
        }

        for(int i = 0; i < str2.length(); i++){
            count[str2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < count.length; i++){
            System.out.println((char)('a' + i) + " -> " + count[i]);
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }
}