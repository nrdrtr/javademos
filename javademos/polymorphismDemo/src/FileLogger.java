public class FileLogger extends BaseLogger{
    @Override
    public void logger(String message) {
        System.out.println("logged to file:"+message);
    }
}
