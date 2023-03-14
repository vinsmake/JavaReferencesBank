public class CreateUser {
    public static void main(String[] args) {
        //creates the user with username and password
        User userVinsmake = new UserEuropean("vinsmake", "myPassword", "enrique", 481516, "Guadalajara", "4815859641523647", 574, 122025, 2000, "UK", "UK542615216524154");

//these two below only shows that the getters works
        //uses the getters to consult.
        System.out.println(userVinsmake.getPassword());

            //these are inside user.client
            System.out.println(userVinsmake.getClient().getName());
            System.out.println(userVinsmake.getClient().getId());
            System.out.println(userVinsmake.getClient().getLocation());

                //these are inside user.client.account
                System.out.println(userVinsmake.getClient().getAccount().getNumber());
                System.out.println(userVinsmake.getClient().getAccount().getCvv());
                System.out.println(userVinsmake.getClient().getAccount().getExpiration());

                    //these are inside UserEuropean 
                    System.out.println(userVinsmake.getCountry());
                    System.out.println(userVinsmake.getPassport());

        User userAmanda = new UserEuropean("Xboxeth", "myPassword", "Amanda", 56852, "Zapopan", "4815632458912586", 254, 82025, 5500, "France", "FR6254651254");
        //uses the getters to consult.
        System.out.println(userAmanda.getUsername());
        System.out.println(userAmanda.getPassword());

            //these are inside user.client
            System.out.println(userAmanda.getClient().getName());
            System.out.println(userAmanda.getClient().getId());
            System.out.println(userAmanda.getClient().getLocation());

                //these are inside user.client.account
                System.out.println(userAmanda.getClient().getAccount().getNumber());
                System.out.println(userAmanda.getClient().getAccount().getCvv());
                System.out.println(userAmanda.getClient().getAccount().getExpiration());

                    //these are inside UserEuropean 
                    System.out.println(userAmanda.getCountry());
                    System.out.println(userAmanda.getPassport());


        //here we are creating an american user, adding the extended version of user.
        User userAmerican = new UserAmerican ("AmericanEagle", "myPassword", "John", 3225, "Los Angeles", "4815632598741526", 468, 072025, 4200,  "United States", "LA526547628545");
                //uses the getters to consult.
                System.out.println(userAmerican.getUsername());
                System.out.println(userAmerican.getPassword());
        
                    //these are inside user.client
                    System.out.println(userAmerican.getClient().getName());
                    System.out.println(userAmerican.getClient().getId());
                    System.out.println(userAmerican.getClient().getLocation());
        
                        //these are inside user.client.account
                        System.out.println(userAmerican.getClient().getAccount().getNumber());
                        System.out.println(userAmerican.getClient().getAccount().getCvv());
                        System.out.println(userAmerican.getClient().getAccount().getExpiration());

                            //these are inside UserAmerican 
                            System.out.println(userAmerican.getCountry());
                            System.out.println(userAmerican.getPassport());

        //polymorphism: We can say that every UserAmerican  are Users, the most generic element can be adapted to the most especific element.
        User userPoly = new UserAmerican ("PabloPoly", "myPassword", "Pablo Garcia", 54262185, "Tijuana", "4848163265859632", 468, 042025, 3200, "Mexico", "TJ489652");

        //because is apolymorphis, it access to the User.java methods, but not to the UserAmerican .java methods, this is because is refered as User (in User userPoly)
        System.out.println("Username: " + userPoly.getUsername() + " Password: " + userPoly.getPassword());
        

        //referemces the AnualYield to use his methods
        AnualYield anualYield = new AnualYield();
        anualYield.Yield(userVinsmake);
        anualYield.Yield(userAmanda);
        anualYield.Yield(userAmerican);
        anualYield.Yield(userPoly);




                //this is a static counter that counts the number of users created
                System.out.println("There are " + User.getCounter() + " users registered"); 







        //deposit
        userVinsmake.deposit(500.0); //this is the first deposit
        userVinsmake.deposit(550.0); //this is the second deposit, which proves that it's working

        //withdraw
        userVinsmake.withdraw(400.0);//this is the first withdraw
        userVinsmake.withdraw(600.0);//this is the second withdraw, which proves that it's working

        //transfer
        userVinsmake.transfer(userAmanda, 500);//to see if it's working
        userVinsmake.transfer(userAmanda, 500);//to see if it transfer and subtract the amount

        //SUPER
        //deposit super
        userAmerican.deposit(500.0); //this is the first deposit
        userAmerican.deposit(550.0); //this is the second deposit, which proves that it's working

        //withdraw super
        userAmerican.withdraw(400.0);//this is the first withdraw
        userAmerican.withdraw(600.0);//this is the second withdraw, which proves that it's working and subtracts the amount and commission

        //transfer super
        userAmerican.transfer(userAmanda, 500);//to see if it's working
        userAmerican.transfer(userAmanda, 500);//to see if it transfer and subtract the amount and commission

        //SUPER polymorph
        //deposit super userPoly
        userPoly.deposit(500.0); //this is the first deposit
        userPoly.deposit(550.0); //this is the second deposit, which proves that it's working

        //withdraw super userPoly
        userPoly.withdraw(400.0);//this is the first withdraw
        userPoly.withdraw(600.0);//this is the second withdraw, which proves that it's working

        //transfer super userPoly
        userPoly.transfer(userAmanda, 500);//to see if it's working
        userPoly.transfer(userAmanda, 500);//to see if it transfer and subtract the amount

        //utility logIn class
/*         logInUtil utilityLogIn = new logInUtil();
        utilityLogIn.logIn(userVinsmake, "mypassword");
        utilityLogIn.logIn(userVinsmake, "myPassword"); */

        userVinsmake.logIn("mypassword");
        userVinsmake.logIn("myPassword");

    }
}
