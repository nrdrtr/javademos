public class MySqlCustomerDal implements ICustomerDal,IRespository{
    @Override
    public void add() {
        System.out.println("MySQL eklendi");
    }
}
