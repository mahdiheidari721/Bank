import java.util.Random;

public class Account {
    Person person;
    int time=0;
    Banks bank;
   String AccountID;
    int Mojoodi;
    boolean Activity=true;
    String CreatingDate;
    String DeadDate;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Banks getBank() {
        return bank;
    }

    public void setBank(Banks bank) {
        this.bank = bank;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }

    public int getMojoodi() {
        return Mojoodi;
    }

    public void setMojoodi(int mojoodi) {
        Mojoodi = mojoodi;
    }

    public boolean isActivity() {
        return Activity;
    }

    public void setActivity(boolean activity) {
        Activity = activity;
    }

    public String getCreatingDate() {
        return CreatingDate;
    }

    public void setCreatingDate(String creatingDate) {
        CreatingDate = creatingDate;
    }

    public String getDeadDate() {
        return DeadDate;
    }

    public void setDeadDate(String deadDate) {
        DeadDate = deadDate;
    }

    public Account(Person person, Banks bank,  String accountID, int mojoodi,String creationdate) {
        this.CreatingDate=creationdate;
        this.person = person;
        this.bank = bank;
        AccountID = accountID;
        Mojoodi = mojoodi;
    }

    String AccountIDGenerator(Account account){
      String s1=account.bank.ID;
        Random r = new Random();
        int t = r.nextInt(99 -10 + 1) +10;
      int s2=t;
      int s3=account.bank.Numberofaccount;
int s4= (Integer.parseInt(s1)*100+s2)*10000000+s3;
String s5=String.valueOf(s4);
int q=0;
//for(int i=0;i<15;i++){
//    if(Integer.parseInt(Character.toString(s5.charAt(i)))<=4){
//        q+=2*Integer.parseInt(Character.toString(s5.charAt(i)));
//    }
//    else
//        q+=(2*Integer.parseInt(Character.toString(s5.charAt(i)))-9);
//}

int w= ((q/10)+1)*10-q-1;
int s6=s4*10+w;
        String s7=String.valueOf(s6);
        return s7;
    }

    @Override
    public String toString() {
        return "Account{" +
                "person=" + person +
                ", bank=" + bank +
                ", AccountID='" + AccountID + '\'' +
                ", Mojoodi=" + Mojoodi +
                ", Activity=" + Activity +
                ", CreatingDate='" + CreatingDate + '\'' +
                ", DeadDate='" + DeadDate + '\'' +
                '}';
    }
}
