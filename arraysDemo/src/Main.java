public class Main {
    public static void main(String[] args) {

        String[] students = new String[4];//4 elemanlı bir dizi
        students[0] = "nurullah";
        students[1] = "Onur";
        students[2] = "Talha";
        students[3] = "Ayça";

        for (int i = 0; i < students.length; i++) {

            System.out.println(students[i]);
        }
        System.out.println("----------------------");
        //bu for ifadesi daha çok kullanılır.
        for (String student:students){//String tipli öğrenciler arasındaki her bir ögrenciyi dolaşşır
            System.out.println(student); //her bir ögernciyi yazdırır.

        }
    }
}