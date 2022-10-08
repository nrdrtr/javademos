public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "laptop", "acer laptop", 12000, 2, "siyah");

        Product product1 = new Product();

        product.setName("Laptop");
        product.setId(2);
        product.setPrice(15000);
        product.setDescription("casper Laptop");
        product.setStockAmount(34);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getCode());
    }
}