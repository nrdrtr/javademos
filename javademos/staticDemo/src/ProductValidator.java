public class ProductValidator {//uygulamaların içinde arac yazarken kullanırız

    public  ProductValidator( ) {
        System.out.println("yapıcı blok çalıştı");
    }

    static {//newlemeye gerek yok
        System.out.println("static yapıcı blok çalıştı");
    }


    public static boolean isValid(Product product) {//bu  methodu direkt class ismiyle çagrılır
        if (!product.name.isEmpty() && product.price > 0) {
            return true;
        }
        return false;
    }
    public void bisey(){//bu methodu cagırmak için içinde bulunduğu classın new'lenmesi gerekir.

    };

    //inner class
    public static  class baskaBirClass{
        public static void sil(){

        }
    }

}
