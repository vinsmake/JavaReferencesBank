public class UserForeign extends User {
    private String country;
    private String passport;

    public UserForeign(String username, String password, String name, int id, String location, String cardNumber,
            int cardCvv, int cardExpiration, String country, String passport) {
        super(username, password, name, id, location, cardNumber, cardCvv, cardExpiration);
        //TODO Auto-generated constructor stub

        this.country = country;
        //super replace this. and selects the class where is extended
        System.out.println(super.client().getName() + "'s country is: " + this.country);
        this.passport = passport;
        System.out.println(super.client().getName() + "'s passport is: " + this.passport);
        }



    public String getCountry() {
        return this.country;
    }

    public String getPassport() {
        return this.passport;
    }


}
