public class DatabaseLogger extends BaseLogger{
    @Override
    public void logger(String message) {
        System.out.println( "logged to database :"+message);

    }
}
