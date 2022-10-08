public class Main {
    public static void main(String[] args) {// 6= 1+2+3  28= 1+2+4+7+14

        int number = 58;
        int total = 0;

        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                total = total + divisor;
            }

        }
        if (total == number) {
            System.out.println("Number is perfect. ");
        } else {
            System.out.println("The number is not perfect.");
        }


    }
}