public class LifelineSite {
    public double getBillableAmount(int units, double rate){
        double base = units * rate * 0.5;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
