import java.util.ArrayList;
import java.util.HashMap;

public class CentralBank {
ArrayList<Banks> banks=new ArrayList<Banks>();
ArrayList<Account> account=new ArrayList<Account>();
    ArrayList<Accounts> accountss=new ArrayList<Accounts>();
    ArrayList<Card> cards=new ArrayList<Card>();
    ArrayList<Loan> loan=new ArrayList<Loan>();
    HashMap<Person, ArrayList> listofaccount = new HashMap<Person, ArrayList>();
    HashMap<Person, ArrayList> listofloan = new HashMap<Person, ArrayList>();

    @Override
    public String toString() {
        return "CentralBank{" +
                "banks=" + banks +
                ", account=" + account +
                ", accountss=" + accountss +
                ", cards=" + cards +
                ", loan=" + loan +
                ", listofaccount=" + listofaccount +
                ", listofloan=" + listofloan +
                '}';
    }
}
