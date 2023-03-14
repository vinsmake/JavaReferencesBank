public class logInUtil {

    private String userPassword;
    private String userUsername;

    public void setUserPassword(String password) {
        this.userPassword = password;
    }

    public void setUserUsername(String username){
        this.userUsername = username;
    }

    public boolean logIn(String password){

        


        if (this.userPassword == password) {
            System.out.println("Welcome " + this.userUsername);
            return true;
        } else {
            System.out.println("Sorry, Incorrect password");
            return false;
        }
    }
}
