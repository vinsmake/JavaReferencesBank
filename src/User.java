public class User {
    private String username;
    private String password;
    private int number;
    private Client client = new Client();
    private static int userCounter = 0; //static makes the data independient of the new creation. The user counter increase when a object is created, so it gives the user a unic number.

    //ask for all the data
    public User(String username, String password, String name, int id, String location, long cardNumber, int cardCvv, int cardExpiration) {
        //User
        this.username = username;
        System.out.println("The User name is: " + this.username);
        this.password = password;
        System.out.println("The Password is: " + this.password);
        userCounter++;
        this.number = userCounter;
        System.out.println("The number of user is: " + this.number);
            //Client
            this.client.setName(name);
            System.out.println("The Name is: " + this.client.getName());
            this.client.setId(id);
            System.out.println("The Id is: " + this.client.getId());
            this.client.setLocation(location);
            System.out.println("The Location is: " + this.client.getLocation());
                //Account
                this.client.getAccount().setNumber(cardNumber);
                System.out.println("The Card Number is: " + this.client.getAccount().getNumber());
                this.client.getAccount().setCvv(cardCvv);
                System.out.println("The Card Cvv is: " + this.client.getAccount().getCvv());
                this.client.getAccount().setExpiration(cardExpiration);
                System.out.println("The Card Expiration is: " + this.client.getAccount().getExpiration());
        System.out.println("There are " + userCounter + " user registered");
    }
    
    public Client client() {
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
}
