public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if(isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)) {
            int rightMostDigitFirstNumber = firstNumber % 10;
            int rightMostDigitSecondNumber = secondNumber % 10;
            int rightMostDigitThirdNumber = thirdNumber % 10;
            return (rightMostDigitFirstNumber == rightMostDigitSecondNumber) ||
                    (rightMostDigitFirstNumber == rightMostDigitThirdNumber) ||
                    (rightMostDigitSecondNumber == rightMostDigitThirdNumber);
        }
        return false;
    }
    public static boolean isValid(int number){
        return (number >= 10) && (number <= 1000);
    }

}
