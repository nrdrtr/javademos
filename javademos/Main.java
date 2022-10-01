public class Main {
    public static void main(String[] args) {
        String message = "bugün hava çok güzel";
        String newMessage = message.substring(0, 2);
        System.out.println(newMessage);
        int number = topla(1, 5);

        System.out.println(number);
        int total = topla2(1, 5, 7, 8, 7, 0);

        System.out.println(total);
    }

    public static void add() {//yapmak istediğin görevi yerine getiriyor

        System.out.println("eklendi");
    }

    public static void remove() {
        System.out.println("silindi");

    }

    public static void update() {
        System.out.println("güncellendi");

    }

    public static int topla(int number1, int number2) {
        return number1 + number2;
    }

    public static String City() {
        return "Sivas";
    }


    //variable arguments değer sınırı yok
    public static int topla2(int... numbers) {

        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return total;

    }

}