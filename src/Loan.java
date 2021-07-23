public class Loan {
    Person person;
    int meghdar;
    int bargardandeshode;
    int darsadbahre;
    int darsadjarime;
    int time=0;
    Banks bank;
  Card card;
  boolean Activity=true;
    String RecievedDate;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Loan(Person person, int meghdar, String recievedDate,Banks bank,Card card) {
        this.person = person;
        this.meghdar = meghdar;
       this. RecievedDate = recievedDate;
        this.bank=bank;
        this.card=card;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getMeghdar() {
        return meghdar;
    }

    public void setMeghdar(int meghdar) {
        this.meghdar = meghdar;
    }

    public int getBargardandeshode() {
        return bargardandeshode;
    }

    public void setBargardandeshode(int bargardandeshode) {
        this.bargardandeshode = bargardandeshode;
    }

    public int getDarsadbahre() {
        return darsadbahre;
    }

    public void setDarsadbahre(int darsadbahre) {
        this.darsadbahre = darsadbahre;
    }

    public int getDarsadjarime() {
        return darsadjarime;
    }

    public void setDarsadjarime(int darsadjarime) {
        this.darsadjarime = darsadjarime;
    }

    public String getRecievedDate() {
        return RecievedDate;
    }

    public void setRecievedDate(String recievedDate) {
        RecievedDate = recievedDate;
    }
}
