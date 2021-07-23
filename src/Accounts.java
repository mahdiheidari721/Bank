public class Accounts extends Account{
    boolean Short;
    Card card;
    String CreatingDate;
    String DeadDate;
    boolean Activity=true;
    public Accounts(Person person, Banks bank,String mode, String accountID, int mojoodi,String creatingDate,Card card) {

        super(person, bank, accountID, mojoodi ,creatingDate);
        if(mode.equalsIgnoreCase("short")){
            this.Short=true;
        }
        else this.Short=false;
        this.card=card;
    }

    public boolean isShort() {
        return Short;
    }

    public void setShort(boolean aShort) {
        Short = aShort;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String getCreatingDate() {
        return CreatingDate;
    }

    @Override
    public void setCreatingDate(String creatingDate) {
        CreatingDate = creatingDate;
    }

    @Override
    public String getDeadDate() {
        return DeadDate;
    }

    @Override
    public void setDeadDate(String deadDate) {
        DeadDate = deadDate;
    }

    @Override
    public boolean isActivity() {
        return Activity;
    }

    @Override
    public void setActivity(boolean activity) {
        Activity = activity;
    }
}
