import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array){
        String arr = Arrays.toString(array);
        System.out.print("Array = "+arr);;
        for(int i=0 ; i< array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        String newArr = Arrays.toString(array);
        System.out.println("Reversed array = "+newArr);
    }

}
