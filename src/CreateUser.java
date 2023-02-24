public class CreateUser {
    public static void main(String[] args) {
        //creates the user with username and password
        User userVinsmake = new User("vinsmake", "myPassword", "enrique", 481516, "Guadalajara", 481585964152L, 574, 122025);

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

        User userAmanda = new User("Xboxeth", "amanda23", "Amanda", 56852, "Zapopan", 481563245896L, 254, 82025);
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

        //this is a static counter that counts the number of users created
        System.out.println("There are " + User.getCounter() + " users registered"); 
    }
}
