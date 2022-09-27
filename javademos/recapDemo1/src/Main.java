public class Main  {
    public static void main(String[] args) {//büyük olan sayıyı bulma
        int number1=35;
        int number2=35;
        int number3=34;

        if (number1>number2){
            if (number1>number3){
                System.out.println("number1 en buyuk sayıdır");
            }else {
                System.out.println("number3 en buyuk sayıdır");
            }
        }else{
            if (number2>number3){
                System.out.println("number2 en buyuk sayıdır");

            }else {
                System.out.println("number3 en buyuk sayıdır");

            }

        }

        int enbuyukSayi= number1;


        if (enbuyukSayi<number2){
            enbuyukSayi = number2;
        }
        if (enbuyukSayi<number3){
            enbuyukSayi = number3;
        }
        System.out.println(enbuyukSayi+ " en buyuk sayıdır");


    }
}
