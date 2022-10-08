public class Main {
    public static void main(String[] args) {
        // ManGameCalculator manGameCalculator = new ManGameCalculator();
        // manGameCalculator.hesapla();

        //GameCalculator gameCalculator = new GameCalculator(); abstract classes asla new'lenemez
        GameCalculator gameCalculator = new ManGameCalculator();

        gameCalculator.hesapla();
        gameCalculator.gameOver();

    }
}