public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.dataBaseManager = new OracleDatabaseManager();
//        customerManager.dataBaseManager = new MySqlDatabaseManager(); Sisteme yeni bir vt eklendiğinde bu şekilde kullanılıyor.
        customerManager.getCustomers();
    }
}