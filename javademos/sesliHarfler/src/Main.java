public class Main {
    public static void main(String[] args) {

        String[] kalınSesliHarfler = {"a", "A", "ı", "I", "o", "O", "u", "U",};
        String girilenHarf = "A";
        boolean isThere = false;

        for (String harfler : kalınSesliHarfler) {
            if (girilenHarf == harfler) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            System.out.println(" kalın sesli harf ");

        } else {
            System.out.println(" kalın sesli harf degil");
            return;
        }

    }

}