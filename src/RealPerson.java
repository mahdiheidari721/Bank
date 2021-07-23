import java.time.LocalDate;
import java.util.ArrayList;

public class RealPerson extends Person {
 public    String name;
  public   String lastname;
 public    String Nationalcode;

 public     ArrayList<Account> Hesabha=new ArrayList<Account>();
     ArrayList<Card> Cards=new ArrayList<Card>();
    ArrayList<Accounts> Acounts =new ArrayList<Accounts>();
    ArrayList<Loan> loans=new ArrayList<Loan>();
    int recievedloan;
    int loantedad;
    int mojoodikol;
    boolean openorcloseaccount;
    boolean tamdidcart;
    boolean changepass1;
    boolean changepass2;
    boolean recieveorpayloan;
boolean Service;

    @Override
    public String toString() {
        return "RealPerson{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Nationalcode='" + Nationalcode + '\'' +
                ", Birthdaydate='" + Datecreation + '\'' +
                ", Hesabha=" + Hesabha +
                ", Cards=" + Cards +
                ", Acounts=" + Acounts +
                ", loans=" + loans +
                ", recievedloan=" + recievedloan +
                ", loantedad=" + loantedad +
                ", mojoodikol=" + mojoodikol +
                ", openorcloseaccount=" + openorcloseaccount +
                ", tamdidcart=" + tamdidcart +
                ", changepass1=" + changepass1 +
                ", changepass2=" + changepass2 +
                ", recieveorpayloan=" + recieveorpayloan +
                ", Service=" + Service +
                '}';
    }

    public RealPerson(String name, String lastname, String nationalcode, String birthdaydate) {
        this.name = name;
        this.lastname = lastname;
        this.Nationalcode = nationalcode;
      this.Datecreation = birthdaydate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalcode() {
        return Nationalcode;
    }

    public void setNationalcode(String nationalcode) {
        Nationalcode = nationalcode;
    }





    public int getRecievedloan() {
        return recievedloan;
    }

    public void setRecievedloan(int recievedloan) {
        this.recievedloan = recievedloan;
    }

    public int getLoantedad() {
        return loantedad;
    }

    public void setLoantedad(int loantedad) {
        this.loantedad = loantedad;
    }

    public int getMojoodikol() {
        return mojoodikol;
    }

    public void setMojoodikol(int mojoodikol) {
        this.mojoodikol = mojoodikol;
    }

    public boolean isOpenorcloseaccount() {
        return openorcloseaccount;
    }

    public void setOpenorcloseaccount(boolean openorcloseaccount) {
        this.openorcloseaccount = openorcloseaccount;
    }

    public boolean isTamdidcart() {
        return tamdidcart;
    }

    public void setTamdidcart(boolean tamdidcart) {
        this.tamdidcart = tamdidcart;
    }

    public boolean isChangepass1() {
        return changepass1;
    }

    public void setChangepass1(boolean changepass1) {
        this.changepass1 = changepass1;
    }

    public boolean isChangepass2() {
        return changepass2;
    }

    public void setChangepass2(boolean changepass2) {
        this.changepass2 = changepass2;
    }

    public boolean isRecieveorpayloan() {
        return recieveorpayloan;
    }

    public void setRecieveorpayloan(boolean recieveorpayloan) {
        this.recieveorpayloan = recieveorpayloan;
    }
}
