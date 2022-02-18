public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        else {
            int sum = 0;
            while(number > 0){
                int lastDigit = number % 10;
                if (lastDigit % 2 == 0)
                        sum = sum + lastDigit;
                number /= 10;
            }
            return sum;
        }
    }
}
