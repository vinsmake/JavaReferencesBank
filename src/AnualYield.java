public class AnualYield {
    private double anual;
    public double Yield(User user) {
        double anualYieldPercentage = 0.12;
        this.anual = user.getClient().getAccount().getCash() * anualYieldPercentage;
        System.out.println("The anual yield with " + anualYieldPercentage + " Yield is: " + this.anual);
        return this.anual;
    }
}
