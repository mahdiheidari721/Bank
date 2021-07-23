import java.util.Random;

public class Card extends Account{
    String CreatingDate;
    String DeadDate;
    String Password;
    int cvv2;
    String Secondpassword;
boolean secondpassactivity=false;
    public String getPassword() {
        return Password;
    }

    public boolean isSecondpassactivity() {
        return secondpassactivity;
    }

    public void setSecondpassactivity(boolean secondpassactivity) {
        this.secondpassactivity = secondpassactivity;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getCvv2() {
        return cvv2;
    }

    public void setCvv2(int cvv2) {
        this.cvv2 = cvv2;
    }

    public String getSecondpassword() {
        return Secondpassword;
    }

    public void setSecondpassword(String secondpassword) {
        Secondpassword = secondpassword;
    }

    public Card(Person person, Banks bank, String accountID, int mojoodi,String creatingDate) {
        super(person, bank, accountID, mojoodi,creatingDate);
    }

  public   int PasswordGenerator(Person person){
        Random r = new Random();
        int i = r.nextInt(9999 -1000 + 1) +1000;
        return i;
    }
 public   int SecondPasswordGenerator(Person person){
        Random r = new Random();
        int i = r.nextInt(999999 -100000 + 1) +100000;
        return i;
    }
}
