public class EmailLogger extends BaseLogger{
    @Override
    public void logger(String message) {
        System.out.println("logged to email :"+message);
    }
}
