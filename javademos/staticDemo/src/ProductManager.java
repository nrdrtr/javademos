public class ProductManager {


    public void add(Product product) {

        if (ProductValidator.isValid(product)) {
            System.out.println("ürün eklendi");
        } else {
            System.out.println("ürün eklenemedi");
        }

//

    }

}
