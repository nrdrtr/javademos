public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{1, 3, 5, 7, 9, 8};
        int toBeSought = 22;
        boolean isThere = false;
        for (int number : numbers) {

            if (number == toBeSought) {
                isThere = true;
                break;  //bulunca döngü bitiyor
            }

        }
        if (isThere) {
            message(" The number you are looking for is present in the array : " + toBeSought);
        } else {
            message("The number you are looking for is not in the array : " + toBeSought);

        }
    }

    public static void message(String message) {
        System.out.println(message);

    }


}