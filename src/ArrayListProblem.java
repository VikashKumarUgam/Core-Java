/* ---Problem Statement---
* You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to
*  tell the number located in yth position of xth line.
* Input Format
* The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that
*  line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of
* queries. Each query will consist of two integers x and y.
* Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"
* */

import java.util.*;
public class ArrayListProblem {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int inputLines = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i<inputLines; i++){
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            String[] numbers = scanner.nextLine().split(" ");
            int length = Integer.parseInt(numbers[0]);
            for(int j = 1; j<=length;j++){
                arrayList2.add(Integer.parseInt(numbers[j]));
            }
            arrayList.add(arrayList2);
        }
        ArrayList<Integer> results = new ArrayList<>();
        int numberOfQueries = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<numberOfQueries;i++){
            String[] numbers = scanner.nextLine().split(" ");
            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);
            try{
                results.add(arrayList.get(x-1).get(y-1));
            }
            catch(Exception e){
                results.add(-1);
            }

        }
        for(int i=0; i < results.size(); i++){
            if(results.get(i) != -1)
                System.out.println( results.get(i) );
            else{
                System.out.println("ERROR!");
            }
        }
    }
}