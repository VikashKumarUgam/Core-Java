public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99){
            return false;
        }
        else {
            int lastDigitNumber1 = number1%10;
            int lastDigitNumber2 = number2%10;
            number1 /= 10;
            number2 /= 10;
            return (lastDigitNumber1 == lastDigitNumber2) || (number1 == number2) || (lastDigitNumber1 == number2) || (lastDigitNumber2 == number1);
        }
        }
    }

