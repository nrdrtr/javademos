public class Main {
    public static void main(String[] args) {

        int number =  0;
        int reminder = number % 2;
        boolean isPrime = true;

        if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (reminder == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        } else {
            System.out.println("number is not prime");
            System.out.println("Note : The smallest prime number is 2.");

        }


    }

}
