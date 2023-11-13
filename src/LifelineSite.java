public class LifelineSite extends Site {
    @Override
    public double getBaseAmount(int units, double rate) {
        return units * rate * 0.5;
    }

    @Override
    public double getTaxAmount(double base) {
        return base * TAX_RATE * 0.2;
    }
}
