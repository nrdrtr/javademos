public abstract class GameCalculator {

    public abstract void hesapla();//bu operasyonun default'u olmasın herkes override etsin ve kendi kurallarını içersin

    public final void gameOver() {// bu sınıfı  miras alan sınıflar bu operasyonu değiştiremez
        System.out.println(" Oyun bitti");
    }
}
