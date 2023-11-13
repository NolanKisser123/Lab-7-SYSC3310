public class main {
    public static void main(String[] args) {
        ResidentialSite rSite = new ResidentialSite();
        LifelineSite lSite = new LifelineSite();

        double rBill = rSite.getBillableAmount(3, 1300);
        double lBill = lSite.getBillableAmount(3, 1300);

        System.out.println("Residential Site Bill: " + rBill);
        System.out.println("Lifeline Site Bill: " + lBill);
    }
}
