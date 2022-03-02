/**
 * Problem Statement
 *  Queries to list are defined as follows:
 * 1 1 x --------insert a node with value x at the end of the list.
 * 1 2 x --------insert a node with value x at the front of the list.
 * 2 n ---------- delete nth index from the list, if not possible then print "Invalid" (without quotes)
 */


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem2 {
    public static void main(String args[] ) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String[] queries = s.nextLine().split(" ");
        int operationtype = Integer.parseInt(queries[0]);
        if(queries.length > 2 & operationtype == 1){
            int addNodePointer = Integer.parseInt(queries[1]);
            int value = Integer.parseInt(queries[2]);
            if(addNodePointer ==1){
                list.add(value);
            }
            else if(addNodePointer ==2){
                list.add(0,value);
            }
        }
        else if(operationtype == 2){
            int index = Integer.parseInt(queries[1]);
            try{
            list.remove(index);}
            catch (Exception e){
                System.out.println("Invalid");
            }
        }

        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
