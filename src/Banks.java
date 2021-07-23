import java.util.ArrayList;
import java.util.HashMap;

public class Banks {
    String name;
    String ID;
    String Datecreation;
    int Investment;
    //anche khod migirad
    int Benefit=15;

    //anche be baghie midahad
int interestpercent;
int time=0;
int Numberofaccount=0;
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getInterestpercent() {
        return interestpercent;
    }

    public void setInterestpercent(int interestpercent) {
        this.interestpercent = interestpercent;
    }

    public Banks(String name, int investment) {
        this.name = name;
        Investment = investment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDatecreation() {
        return Datecreation;
    }

    public void setDatecreation(String datecreation) {
        Datecreation = datecreation;
    }

    public int getInvestment() {
        return Investment;
    }

    public void setInvestment(int investment) {
        Investment = investment;
    }

    public int getBenefit() {
        return Benefit;
    }

    public void setBenefit(int benefit) {
        Benefit = benefit;
    }

    HashMap<Person, ArrayList> listofaccount = new HashMap<Person, ArrayList>();
    HashMap<Person, ArrayList> listofloan = new HashMap<Person, ArrayList>();
    ArrayList<Accounts>accounts=new ArrayList<>();
    ArrayList<Card> cards=new ArrayList<>();

    @Override
    public String toString() {
        return "Banks{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", Datecreation='" + Datecreation + '\'' +
                ", Investment=" + Investment +
                ", Benefit=" + Benefit +
                ", interestpercent=" + interestpercent +
                ", listofaccount=" + listofaccount +
                ", listofloan=" + listofloan +
                '}';
    }
}
