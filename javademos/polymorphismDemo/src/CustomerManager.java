public class CustomerManager {
    private  BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {// bu  classin bu constructor'i newlerken calisiyor
        this.baseLogger = baseLogger;
    }

    public  void add(){
         this.baseLogger.logger("log mesajı");
     }
}
