import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg= 0;
        int count = 0;
        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                avg = (long) Math.round((double) sum/++count) ;
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();
    }
}
