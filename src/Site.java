public abstract class Site {
    public final double TAX_RATE = 0.15;
    public double getBillableAmount(int units, double rate) {
        double base = getBaseAmount(units, rate);
        double tax = getTaxAmount(base);
        return base + tax;
    }

    public abstract double getBaseAmount(int units, double rate);

    public abstract double getTaxAmount(double base);
}
