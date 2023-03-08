public class Client {
    private String name;
    private int id;
    private String location;
    private Account account = new Account();


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //to deposite inside the account/cash
    public void deposit(double amount) {
        amount = this.account.getCash() + amount;
        account.setCash(amount);
    }

    //to withdraw inside the accound/cash
    public void withdraw(double amount) {
        double cash = this.account.getCash();
        if (amount <= cash){
            amount = cash - amount;
            this.account.setCash(amount);
        } else {
            System.out.println("Sorry, there's not enought cash to withdraw " + amount + "in this account");
        };
        System.out.println("This account have: " + this.account.getCash());
    };

    //to transfer inside the accound/cash within accounts
    public void transfer(User to, double amount){
        double thisCash = this.account.getCash();
        if(thisCash >= amount){

            this.withdraw(amount);

            to.deposit(amount);



            System.out.println("The transference has succed, this account have: " + this.account.getCash() + "and the transfered account " + to.getClient().getName() + "now have" + to.getClient().getAccount().getCash());
        } else {
            System.out.println("Sorry, there's not enought cash in this account to transfer to " + to.getClient().getName() + "because this account only have " + this.account.getCash());
        }
    }


}
