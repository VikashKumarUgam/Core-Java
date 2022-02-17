public class DecimalConverter {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        number1 = (int) (number1 * 1000);
        number2 = (int) (number2 * 1000);
        return number1 == number2;
    }
}
