public abstract class Site {
    public final double TAX_RATE = 0.15;
    public double getBillableAmount(int units, double rate) {
        double base = getBaseAmount(units, rate);
        double tax = getTaxAmount(base);
        return base + tax;
    }

    protected abstract double getBaseAmount(int units, double rate);

    protected double getTaxAmount(double base) {
        return base * TAX_RATE;
    }
}
