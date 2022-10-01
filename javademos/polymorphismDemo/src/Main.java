public class Main {//çok biçimlilik

    public static void main(String[] args) {
        BaseLogger[] baseloggers = new BaseLogger[]{new EmailLogger(), new FileLogger(), new DatabaseLogger()};

        for (BaseLogger baselogger : baseloggers) {
            baselogger.logger("başarılı bir şekilde");

        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());

        customerManager.add ();

    }
}