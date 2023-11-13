public abstract class Site {
    public final double TAX_RATE = 0.15;

    /**
     * Class for calculating the bill amount
     * @param units
     * @param rate
     * @return
     */
    public double getBillableAmount(int units, double rate) {
        double base = getBaseAmount(units, rate);
        double tax = getTaxAmount(base);
        return base + tax;
    }

    /**
     * Abstract class for calculating base amount
     * @param units
     * @param rate
     * @return
     */
    public abstract double getBaseAmount(int units, double rate);

    /**
     * Abstract class for calculating tax amount
     * @param base
     * @return
     */
    public abstract double getTaxAmount(double base);
}
