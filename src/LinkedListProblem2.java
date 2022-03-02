/**
 * Problem Statement
 * Using the linked list find the nth largest element in the list
 * Take the list as input from the user
 * Take the nth number from the index
 * Print out the nth largest element in the console
 */

import java.util.*;

public class LinkedListProblem2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the number of Elements in list :");
        int number = scanner.nextInt();
        for(int i = 0; i< number; i++){
            System.out.println("Please Enter the elements :");
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        int index = scanner.nextInt();
        System.out.println("Maximum Element in the list is " + list.get(list.size()-index));
    }
}