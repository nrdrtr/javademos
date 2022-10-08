public class Main {
    public static void main(String[] args) {

        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;


        for (int divisor = 1; divisor < number1; divisor++) {
            if (number1 % divisor == 0) {
                total1 = total1+ divisor;
            }

        }for (int divisor = 1; divisor < number2; divisor++) {
            if (number2 % divisor == 0) {
                total2 = total2+ divisor;
            }

        }
        if (total1==number2 && total2==number1){
            System.out.println("Numbers are friends");
        }else {
            System.out.println("Numbers are not friends.");
        }


    }
}