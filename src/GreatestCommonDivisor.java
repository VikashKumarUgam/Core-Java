public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10)
            return -1;
        else{
            int largest = Math.max(first, second);
            int lowest = Math.min(first,second);
            while(largest % lowest != 0){
                int temp = largest % lowest;
                largest = lowest;
                lowest = temp;
            }
            return lowest;
        }
    }
}
