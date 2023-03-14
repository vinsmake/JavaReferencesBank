public abstract class User{
    private String username;
    private String password;
    private int number;
    private Client client = new Client();
    private static int userCounter = 0; //static makes the data independient of the new creation. The user counter increase when a object is created, so it gives the user a unic number.

    private logInUtil util;
    //ask for all the data
    public User(String username, String password, String name, int id, String location, String cardNumber, int cardCvv, int cardExpiration, double cash) {
        //User

        //user name
        if (username.length() >= 6){
            this.username = username;
        } else {
            System.out.println("Invalid username, must have 8+ letters and none numbers");
        };
        
        System.out.println("The User name is: " + this.username);

        //password
        if (password.length() >= 6) {
        this.password = password;
        } else {
            System.out.println("Invalid password, must have 6+ letters");
        };
        System.out.println("The Password is: " + this.password);


        //number of user
        userCounter++;
        this.number = userCounter;
        System.out.println("The number of user is: " + this.number);


            //Client
            //client name
            this.client.setName(name);
            System.out.println("The Name is: " + this.client.getName());


            //client id
            this.client.setId(id);
            System.out.println("The Id is: " + this.client.getId());


            //client location
            this.client.setLocation(location);
            System.out.println("The Location is: " + this.client.getLocation());


                //Account 
                //Account  card number
                if (cardNumber.length() == 16) {
                this.client.getAccount().setNumber(cardNumber);
                } else {
                    System.out.println("Error: the card numbers must have 16 numbers, but you wrote " + cardNumber.length());
                }
                System.out.println("The Card Number is: " + this.client.getAccount().getNumber());


                //Account card cvv
                this.client.getAccount().setCvv(cardCvv);
                System.out.println("The Card Cvv is: " + this.client.getAccount().getCvv());


                //Account card expiration date
                this.client.getAccount().setExpiration(cardExpiration);
                System.out.println("The Card Expiration is: " + this.client.getAccount().getExpiration());

                //Account cash
                this.client.getAccount().setCash(cash);
                System.out.println("The Account's cash is: " + this.client.getAccount().getCash());


        //init login util, here we're initialiting a unility class
        this.util = new logInUtil();
        this.util.setUserPassword(password);
        this.util.setUserUsername(username);

        //total accounts registered 
        System.out.println("There are " + userCounter + " user registered");
    }
    
    //need to convert to getter
    public Client getClient() {
        return client;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static int getCounter() { //returns the total of accounts created
        return User.userCounter;
    }
//To rewrite the deposit method inside client.
    public void deposit(Double amount){
        amount = client.getAccount().getCash() + amount;
        client.getAccount().setCash(amount);
        System.out.println("The new cash is: " + this.client.getAccount().getCash());
    }

//to rewrite the withdraw inside client
    public void withdraw(double amount){
        double cash = this.client.getAccount().getCash();
        if (amount <= cash){
            amount = cash - amount;
            this.client.getAccount().setCash(amount);
        } else {
            System.out.println("Sorry, there's not enought cash to withdraw " + amount + "in this account");
        };
        System.out.println("This account have: " + this.client.getAccount().getCash());
    };

//to rewrite the transfer inside client
    public void transfer(User to, double amount){
        System.out.println("the account which is trying to transfer has: " + this.getClient().getAccount().getCash()); 
        double thisCash = this.client.getAccount().getCash();
        if(thisCash >= amount){
            this.client.withdraw(amount); //calls the method inside client
            to.client.deposit(amount);//calls the method inside client
            System.out.println("The transference has succed, this account have: " + this.client.getAccount().getCash() + " and the transfered account " + to.getClient().getName() + " now have " + to.getClient().getAccount().getCash());
        } else {
            System.out.println("Sorry, there's not enought cash in this account to transfer to " + to.getClient().getName() + "because this account only have " + this.client.getAccount().getCash());
        }
    }





    //to get country and passport in the child classes
    public String getCountry() {
        return this.getCountry();
    }

    public String getPassport() {
        return this.getPassport();
    }


    //here we're using a unility class
    public boolean logIn(String password){
        return this.util.logIn(password);
    }
    
}
