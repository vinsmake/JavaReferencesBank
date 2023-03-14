public class UserEuropean extends User {
    private String country;
    private String passport;

    public UserEuropean(String username, String password, String name, int id, String location, String cardNumber,
            int cardCvv, int cardExpiration, double cash, String country, String passport) {
        //Access to the super constructor. Overloads the constructor
        super(username, password, name, id, location, cardNumber, cardCvv, cardExpiration, cash);

        //Start filling the foreign info.
        this.country = country;
        //super replace this. and selects the class where is extended
        System.out.println(super.getClient().getName() + "'s country is: " + this.country);
        this.passport = passport;
        System.out.println(super.getClient().getName() + "'s passport is: " + this.passport);
        }



    public String getCountry() {
        return this.country;
    }

    public String getPassport() {
        return this.passport;
    }


    //SUPER of deposit, withdraw and transfer
    //override of deposite
    @Override
    public void deposit(Double amount) {
        super.deposit(amount);
    }


    //override of withdraw
    @Override
    public void withdraw(double amount) { //this method has commition to foreign accounts
        double commission = amount * 0.2;
        double total = commission + amount;

        double cash = super.getClient().getAccount().getCash();

        if(total <= cash){
        super.withdraw(amount + commission);
        } else {
            System.out.println("Sorry, this account doesn't have anought cash");
        }
    }


    //override of transfer
    @Override
    public void transfer(User to, double amount) {
        super.transfer(to, amount);
    }

}
