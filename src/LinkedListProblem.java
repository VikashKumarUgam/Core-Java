/*
* Problem Statement :
* Given a list,L , of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted
* */
import java.util.*;

public class LinkedListProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = Integer.parseInt(scanner.nextLine());
        //String[] stringNumbers = scanner.nextLine().split(" ");
        List<Integer> numbers = new LinkedList<>();
        for(int i = 0; i<numberOfElements; i++){
            numbers.add(i, scanner.nextInt());
        }
        int numberOfQueries = scanner.nextInt();
        for(int i = 0; i<numberOfQueries; i++){
            String query = scanner.next();
            if(query.equals("Insert")){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                numbers.add(index, value);
            }
            else if(query.equals("Delete")){
                int index = scanner.nextInt();
                numbers.remove(index);
            }
        }
        scanner.close();
        for(int i =0 ; i< numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }
    }
}