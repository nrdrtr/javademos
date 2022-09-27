public class Main {
    public static void main(String[] args) {

        //for
        for (int i = 1; i < 10; i++) {
            System.out.println("for döngüsü sonu");
        }


        //while for ile yapılan dögüler while ile de yapılabilir. Tersi durumda geçerlidir.
        int i = 1;//bir değişken sadece tanımlandıgı blokta geçerlidir.Yukarıdaki i'yi kullanamıyoruz.

        while(i<10){
            System.out.println(i);
            i++;

         }
        System.out.println("while döngüsü sonu");

        //do-while şart sağlanmasa da bir kere çalışır

        int j =35;
        do{
            System.out.println("başarısız bir işlem gerçekleşse bile olayın kaydını almak için kullanılabilir.");
            System.out.println(j);
            j++;

        }
        while (j<10);
            System.out.println("do-while döngüsü sonu");



    }
}