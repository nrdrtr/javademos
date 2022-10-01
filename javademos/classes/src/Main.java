public class Main {
    public static void main(String[] args) {
//classes reference type
        CustomerManager customerManager = new CustomerManager();//bunun  referansı bellekte boşta kalıyor onu da garbage collecter java'nin bellek yönetici hallediyor
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();


        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 =30;

        System.out.println(number2);


        int[] numbers = new int[] {1,2,3};
        int[] numbers2 = new int[] {4,5,6};
        numbers2 =numbers;
        numbers[0]=23;
        System.out.println(numbers2[0]);
    }
}