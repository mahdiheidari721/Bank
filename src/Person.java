import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Person {
    String Nationalcode;
    String Datecreation;
    ArrayList<Account> Hesabha=new ArrayList<Account>();
    ArrayList<Card> Cards=new ArrayList<Card>();
    ArrayList<Accounts> Acounts =new ArrayList<Accounts>();
    ArrayList<Loan> loans=new ArrayList<Loan>();
    public int age (LocalDate now){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate mm = LocalDate.parse(Datecreation, formatter);
        return now.getYear()-mm.getYear();
    }

    public String getNationalcode() {
        return Nationalcode;
    }

    public void setNationalcode(String nationalcode) {
        Nationalcode = nationalcode;
    }

    public String getDatecreation() {
        return Datecreation;
    }

    public void setDatecreation(String datecreation) {
        Datecreation = datecreation;
    }
}
