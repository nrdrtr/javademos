public class Main {
    public static void main(String[] args) {//   static kavramlar newlenerek çağırılamaz


        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 12;
        product.name = "telefon";
        productManager.add(product);


        DatabaseHelper.Crud.delete();
        DatabaseHelper.Crud.update();
        DatabaseHelper.Crud.Connection.createConnection();
    }
}
