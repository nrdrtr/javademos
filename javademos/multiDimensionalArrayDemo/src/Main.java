public class Main {
    public static void main(String[] args) {

        String[][] cities = new String[3][3];

        cities[0][0] = "Sivas";
        cities[0][1] = "Ankara";
        cities[0][2] = "Istanbul";
        cities[1][0] = "Izmir";
        cities[1][1] = "Balikesir";
        cities[1][2] = "Bolu";
        cities[2][0] = "Hatay";
        cities[2][1] = "Amasya";
        cities[2][2] = "Sivas";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}