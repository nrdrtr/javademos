public class AgricultureCreditManager extends BaseCreditManager {
    @Override
    public double calculate(double amount) {
        return super.calculate(amount*1.66);
    }
}
