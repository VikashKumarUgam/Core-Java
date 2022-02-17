public class TeenNumberChecker {
    public static boolean hasTeen(int number1, int number2, int number3){
        return (number1 <= 19 && number1 >= 13) || (number2 <= 19 && number2 >= 13) || (number3 <= 19 && number3 >= 13);
    }
    public static boolean isTeen(int number){
        return (number <= 19 && number >= 13);
    }
}
