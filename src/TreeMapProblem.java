/**
 * Problem Statement
 * Take Employee Details which contains Name of the employee and its salary from the user
 * Name should be of one word followed by space and then salary
 * Store the details of the employee in TreeMap using Key as Name and Salary as its value
 */


import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapProblem{
    public static void main(String[] args) {

        TreeMap<String, Integer> employee = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfEmployees = scanner.nextInt();
        for(int i = 0; i<numberOfEmployees; i++){
            String[] employeeDetails = scanner.nextLine().split(" ");
            String employeeName = employeeDetails[0];
            int salary = Integer.parseInt(employeeDetails[0]);
            employee.put(employeeName,salary);

        }
    }

}
