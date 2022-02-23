import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for(int i = 0; i< number; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min= Integer.MAX_VALUE;
        for(int i =0; i<array.length; i++){
            min = Math.min(min, array[i]);
        }
        return min;
    }

}
