public class Account {
    private String number;
    private int cvv;
    private int expiration;
    private double cash;



    public String getNumber() {
        return this.number;
    }

    public void setNumber(String cardNumber) {
        this.number = cardNumber;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExpiration() {
        return this.expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }


    public double getCash() {
        return this.cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }




}
