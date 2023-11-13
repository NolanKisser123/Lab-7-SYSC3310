public class LifelineSite extends Site {
    @Override
    protected double getBaseAmount(int units, double rate) {
        return units * rate * 0.5;
    }
}
