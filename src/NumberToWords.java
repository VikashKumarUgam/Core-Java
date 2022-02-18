public class NumberToWords {

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        else {
            int reversedNumber = reverse(number);
            int count = getDigitCount(number);
            for(int i=0; i<count;i++){
                int lastDigit = reversedNumber % 10;
                reversedNumber /= 10;
                switch (lastDigit){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int prevNumber= number;
        if (number < 0)
            number *= -1;
        while(number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        if (prevNumber < 0){
            return -1*reverse;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        else if (number == 0)
            return 1;
        else{
            int count = 0;
            while (number > 0) {
                count += 1;
                number /= 10;
            }
            return count;
        }
    }

}

