public class CreateUser {
    public static void main(String[] args) {
        //creates the user with username and password
        User userVinsmake = new User("vinsmake", "myPassword", "enrique", 481516, "Guadalajara", "4815859641523647", 574, 122025);

//these two below only shows that the getters works
        //uses the getters to consult.
        System.out.println(userVinsmake.getUsername());
        System.out.println(userVinsmake.getPassword());

            //these are inside user.client
            System.out.println(userVinsmake.client().getName());
            System.out.println(userVinsmake.client().getId());
            System.out.println(userVinsmake.client().getLocation());

                //these are inside user.client.account
                System.out.println(userVinsmake.client().getAccount().getNumber());
                System.out.println(userVinsmake.client().getAccount().getCvv());
                System.out.println(userVinsmake.client().getAccount().getExpiration());

        User userAmanda = new User("Xboxeth", "amanda23", "Amanda", 56852, "Zapopan", "4815632458912586", 254, 82025);
        //uses the getters to consult.
        System.out.println(userAmanda.getUsername());
        System.out.println(userAmanda.getPassword());

            //these are inside user.client
            System.out.println(userAmanda.client().getName());
            System.out.println(userAmanda.client().getId());
            System.out.println(userAmanda.client().getLocation());

                //these are inside user.client.account
                System.out.println(userAmanda.client().getAccount().getNumber());
                System.out.println(userAmanda.client().getAccount().getCvv());
                System.out.println(userAmanda.client().getAccount().getExpiration());


        //here we are creating an foreign user, adding the extended version of user.
        UserForeign userAmerican = new UserForeign("AmericanEagle", "myAmericanPassword", "John", 3225, "Los Angeles", "4815632598741526", 468, 072025, "United States", "LA526547628545");
                //uses the getters to consult.
                System.out.println(userAmerican.getUsername());
                System.out.println(userAmerican.getPassword());
        
                    //these are inside user.client
                    System.out.println(userAmerican.client().getName());
                    System.out.println(userAmerican.client().getId());
                    System.out.println(userAmerican.client().getLocation());
        
                        //these are inside user.client.account
                        System.out.println(userAmerican.client().getAccount().getNumber());
                        System.out.println(userAmerican.client().getAccount().getCvv());
                        System.out.println(userAmerican.client().getAccount().getExpiration());

                            //these are inside UserForeign
                            System.out.println(userAmerican.getCountry());
                            System.out.println(userAmerican.getPassport());
        //this is a static counter that counts the number of users created
        System.out.println("There are " + User.getCounter() + " users registered"); 
    }
}
