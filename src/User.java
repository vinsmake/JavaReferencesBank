public class User {
    private String username;
    private String password;
    private int number;
    private Client client = new Client();
    private static int userCounter = 0; //static makes the data independient of the new creation. The user counter increase when a object is created, so it gives the user a unic number.

    //ask for all the data
    public User(String username, String password, String name, int id, String location, String cardNumber, int cardCvv, int cardExpiration) {
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


        //total accounts registered 
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
