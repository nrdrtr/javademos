public class Main {
    public static void main(String[] args) {

        double myList[] = {1.3, 45.6, 5.5, 34.9, 7.6};
        double total = 0;
        double maxNumber = myList[0];
        for (double number : myList) {
            if (maxNumber < number) {
                maxNumber = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("en buyuk sayi :" + maxNumber);
        System.out.println("sayilarin toplami : " + total);
    }
}