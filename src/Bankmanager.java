import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Bankmanager {
    public Bankmanager() {
        ArrayList<Person> legalperson= new ArrayList<Person>();
        ArrayList<Person> realperson= new ArrayList<Person>();
        ArrayList<Banks> banks= new ArrayList<Banks>();
    }


    static LocalDate now = LocalDate.now();
    ENUM ENUM=new ENUM();
    DateandTime dateandTime=new DateandTime();
   CentralBank centralbank=new CentralBank();
   public ArrayList<Person> legalperson= new ArrayList<Person>();
     public ArrayList<Person> realperson= new ArrayList<Person>();
  public ArrayList<Banks> banks= new ArrayList<Banks>();
    void AddRealPerson(String[] split){
RealPerson realPersonn=new RealPerson(split[2],split[3],split[4],split[5]);
realperson.add(realPersonn);
        System.out.println(realperson.size());
    }
    void AddLegalPerson(String[] split){
        LegalPerson legalPerson=new LegalPerson(split[2],now.toString());
        realperson.add(legalPerson);
    }
    void AddBank(String[] split){
if(split.length==4){
    for(int i=0;i<ENUM.Name.size();i++){
        if(ENUM.Name.get(i).equalsIgnoreCase(split[2])){
            Banks bank=new Banks( split[2], Integer.parseInt(split[3]));
            bank.setID(ENUM.ID.get(i));
            bank.setDatecreation(now.toString());
            banks.add(bank);
            centralbank.banks.add(bank);
            System.out.println(banks.size());
        }
    }
    }

        if(split.length==3){
            for(int i=0;i<ENUM.Name.size();i++){
                if(ENUM.Name.get(i).equalsIgnoreCase(split[2])){
                    Banks bank=new Banks(split[2],5);
                    bank.setID(ENUM.ID.get(i));
                    banks.add(bank);
                    System.out.println(banks.size());
                    centralbank.banks.add(bank);
                }
            }

        }
    }
void nerkhedaramad(String[] split){
        for(int i=0;i<banks.size();i++){
            if(banks.get(i).getName().equalsIgnoreCase( split[4])){
                banks.get(i).setBenefit(Integer.parseInt(split[5]));
            }
        }
}
    void SoodDehi(String[] split){
        for(int i=0;i<banks.size();i++){
            if(banks.get(i).getName().equalsIgnoreCase( split[4])){
                banks.get(i).setInterestpercent(Integer.parseInt(split[5]));
            }
        }
    }
    void Addinvestmentforbank(String[] split){
        for(int i=0;i<banks.size();i++){
            if(banks.get(i).getName().equalsIgnoreCase( split[3])){
                int a=banks.get(i).getInvestment();
                banks.get(i).setInvestment(a+Integer.parseInt(split[4]));
            }
        }
    }
    void OpenCard(String[] split){
for(int i=0;i<realperson.size();i++){
 if(realperson.get(i).getNationalcode().equalsIgnoreCase(split[4])&&realperson.get(i).age(now)>=16){
     for(int j=0;j<centralbank.banks.size();j++){
         if(centralbank.banks.get(j).getName().equalsIgnoreCase(split[3])){
             System.out.println("card");
             Card account=new Card(realperson.get(i),banks.get(j),"00",Integer.parseInt(split[5]),now.toString());
             LocalDate s=now.plusYears(4);
             account.setDeadDate(s.toString());
            // account.setAccountID(account.AccountIDGenerator(account));
             account.setCvv2((int)Math.floor(Math.random()*(999-100+1)+100));
             account.setPassword(String.valueOf( Math.floor(Math.random()*(9999-1000+1)+1000)));
             realperson.get(i).Cards.add(account);
             realperson.get(i).Hesabha.add(account);
             centralbank.account.add(account);
             centralbank.cards.add(account);
             banks.get(j).cards.add(account);
banks.get(j).listofaccount.put(realperson.get(i),realperson.get(i).Hesabha);
centralbank.listofaccount.put(realperson.get(i),realperson.get(i).Hesabha);
         }
     }

 }
}
        for(int i=0;i<legalperson.size();i++){
            if(legalperson.get(i).getNationalcode().equalsIgnoreCase(split[4])&&legalperson.get(i).age(now)>=16){
                for(int j=0;j<banks.size();j++){
                    if(banks.get(j).getName().equalsIgnoreCase(split[3])){
                        Card account=new Card(legalperson.get(i),banks.get(j),"00",Integer.parseInt(split[5]),now.toString());
                        account.setAccountID(account.AccountIDGenerator(account));
                        LocalDate s=now.plusYears(4);
                        account.setDeadDate(s.toString());
                        account.setCvv2((int)Math.floor(Math.random()*(999-100+1)+100));
                        account.setPassword(String.valueOf( Math.floor(Math.random()*(9999-1000+1)+1000)));
                        legalperson.get(i).Cards.add(account);
                        legalperson.get(i).Hesabha.add(account);
                        banks.get(j).cards.add(account);
                        centralbank.account.add(account);
                        banks.get(j).listofaccount.put(legalperson.get(i),realperson.get(i).Hesabha);
                        centralbank.listofaccount.put(legalperson.get(i),realperson.get(i).Hesabha);
                        centralbank.cards.add(account);
                    }
                }

            }
        }

    }
    void OpenAccounts(String[] split){
        for(int i=0;i<realperson.size();i++){
            if(realperson.get(i).getNationalcode().equalsIgnoreCase(split[4])&&realperson.get(i).age(now)>=16){
                for(int j=0;j<centralbank.banks.size();j++){
                    if(centralbank.banks.get(j).getName().equalsIgnoreCase(split[3])){
                        Card card=new Card(realperson.get(i),banks.get(j),"00",0,now.toString());
                        card.setAccountID(card.AccountIDGenerator(card));
                        card.setCvv2((int)Math.floor(Math.random()*(999-100+1)+100));
                        card.setPassword(String.valueOf( Math.floor(Math.random()*(9999-1000+1)+1000)));
                        realperson.get(i).Cards.add(card);
                        realperson.get(i).Hesabha.add(card);
                        centralbank.account.add(card);
                        banks.get(j).cards.add(card);
                        banks.get(j).listofaccount.put(realperson.get(i),realperson.get(i).Hesabha);
                        centralbank.listofaccount.put(realperson.get(i),realperson.get(i).Hesabha);
                        Accounts account=new Accounts(realperson.get(i),banks.get(j),split[5],"00",Integer.parseInt(split[6]),now.toString(),card);
                        account.setAccountID(account.AccountIDGenerator(account));
                        realperson.get(i).Acounts.add(account);
                        realperson.get(i).Hesabha.add(account);
                        banks.get(j).accounts.add(account);
                        centralbank.account.add(account);
                        centralbank.accountss.add(account);
                    }
                }

            }
        }
        for(int i=0;i<legalperson.size();i++){
            if(legalperson.get(i).getNationalcode().equalsIgnoreCase(split[4])&&legalperson.get(i).age(now)>=16){
                for(int j=0;j<banks.size();j++){
                    if(banks.get(j).getName().equalsIgnoreCase(split[3])){
                        Card card=new Card(legalperson.get(i),banks.get(j),"00",0,now.toString());
                        card.setAccountID(card.AccountIDGenerator(card));
                        card.setCvv2((int)Math.floor(Math.random()*(999-100+1)+100));
                        card.setPassword(String.valueOf( Math.floor(Math.random()*(9999-1000+1)+1000)));
                        legalperson.get(i).Cards.add(card);
                        legalperson.get(i).Hesabha.add(card);
                        centralbank.account.add(card);
                        banks.get(j).cards.add(card);
                        banks.get(j).listofaccount.put(legalperson.get(i),legalperson.get(i).Hesabha);
                        centralbank.listofaccount.put(legalperson.get(i),legalperson.get(i).Hesabha);
                        Accounts account=new Accounts(legalperson.get(i),banks.get(j),split[5],"00",Integer.parseInt(split[6]),now.toString(),card);
                        account.setAccountID(account.AccountIDGenerator(account));
                        legalperson.get(i).Acounts.add(account);
                        legalperson.get(i).Hesabha.add(account);
                        banks.get(j).accounts.add(account);
                        centralbank.account.add(account);
                        centralbank.accountss.add(account);
                    }
                }

            }
        }

    }
    void close(String[] split){
for(int i=0;i<centralbank.account.size();i++){
    if(centralbank.account.get(i).getAccountID().equalsIgnoreCase(split[4])){
        centralbank.account.get(i).setActivity(false);
    }
}
    }
    void ChangeCardPass(String[] split ){

        for(int i=0;i<centralbank.cards.size();i++){
            if(centralbank.cards.get(i).getAccountID().equalsIgnoreCase(split[3])){
                if(centralbank.cards.get(i).getPassword().equalsIgnoreCase(split[4])){
                    centralbank.cards.get(i).setPassword(split[5]);
                }
                else
                    System.out.println("your password is not corrected");
            }
        }
    }
    void SeconPassActivation(String[] split) {
        for(int i=0;i<centralbank.cards.size();i++){
            if(centralbank.cards.get(i).getAccountID().equalsIgnoreCase(split[4])){
                if(centralbank.cards.get(i).getPassword().equalsIgnoreCase(split[5])){
                    centralbank.cards.get(i).setSecondpassword(split[6]);
                    centralbank.cards.get(i).setSecondpassactivity(true);
                }
                else
                    System.out.println("your password is not corrected");
            }
        }
    }
    void ChangeSecondCardPass(String[] split ){
        for(int i=0;i<centralbank.cards.size();i++){
            if(centralbank.cards.get(i).getAccountID().equalsIgnoreCase(split[4])){
                if(centralbank.cards.get(i).getPassword().equalsIgnoreCase(split[5])&& centralbank.cards.get(i).secondpassactivity){
                    centralbank.cards.get(i).setPassword(split[6]);
                }
                else
                    System.out.println("your password is not corrected or you dont have second pass");
            }
        }
    }
void tamdid(String[] split){
    for(int i=0;i<centralbank.cards.size();i++){
        if(centralbank.cards.get(i).getAccountID().equalsIgnoreCase(split[6])&&centralbank.cards.get(i).getBank().getName().equalsIgnoreCase(split[4])){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            LocalDate mm = LocalDate.parse(centralbank.cards.get(i).getDeadDate(), formatter);
            LocalDate s=mm.plusYears(4);
            centralbank.cards.get(i).setActivity(true);
            centralbank.cards.get(i).setDeadDate(s.toString());
            }
            else
                System.out.println("your card doesnt exist");
        }
    }
    void variz(String[] split){
        for(int i=0;i<centralbank.cards.size();i++){
            if(centralbank.cards.get(i).getAccountID().equalsIgnoreCase(split[3])&&centralbank.cards.get(i).getBank().getName().equalsIgnoreCase(split[2])){
                int a= centralbank.cards.get(i).getMojoodi()+Integer.parseInt(split[4]);
                centralbank.cards.get(i).setMojoodi(a);
            }
            else
                System.out.println("your card doesnt exist");
        }
    }
    void daryaftvajh(String[] split){
        if(split.length==5){
            for(int i=0;i<centralbank.cards.size();i++){
                if(centralbank.cards.get(i).getAccountID().equalsIgnoreCase(split[3])&&centralbank.cards.get(i).getPassword().equalsIgnoreCase(split[3])&&Integer.parseInt(split[4])<=2000){

                    centralbank.cards.get(i).setMojoodi(centralbank.cards.get(i).getMojoodi()-Integer.parseInt(split[4]));
                }
                else
                    System.out.println("your card doesnt exist or your pass is incorrect or the amount is forbidden");
            }
        }
        if(split.length==6){
            for(int i=0;i<centralbank.cards.size();i++){
                if(centralbank.cards.get(i).AccountID.equalsIgnoreCase(split[3])&&centralbank.cards.get(i).bank.name.equalsIgnoreCase(split[2])&&centralbank.cards.get(i).person.Nationalcode.equalsIgnoreCase(split[2])){
                    centralbank.cards.get(i).setMojoodi(centralbank.cards.get(i).Mojoodi-Integer.parseInt(split[5]));
                }
                else
                    System.out.println("your card doesnt exist or your nationalcode is incorrect ");
            }
        }

    }
    void estelammojoodi(String[] split){
        for(int i=0;i<centralbank.cards.size();i++){
            if(centralbank.cards.get(i).getAccountID().equalsIgnoreCase(split[3])&&centralbank.cards.get(i).getPassword().equalsIgnoreCase(split[3])){

                System.out.println(centralbank.cards.get(i).getMojoodi());
            }
            else
                System.out.println("your card doesnt exist or your pass is incorrect ");
        }
    }
   void enteghalevajh(String[] split){
       if(split.length==9){
           for(int i=0;i<centralbank.cards.size();i++){
               if(centralbank.cards.get(i).getAccountID().equalsIgnoreCase(split[5])&&centralbank.cards.get(i).getPassword().equalsIgnoreCase(split[6])&&Integer.parseInt(split[8])<=5000&& centralbank.cards.get(i).Mojoodi>=Integer.parseInt(split[8])){

                   for(int j=0;j<centralbank.cards.size();j++){
                       if(centralbank.cards.get(j).getAccountID().equalsIgnoreCase(split[7])){
                           centralbank.cards.get(i).setMojoodi( centralbank.cards.get(i).getMojoodi()-Integer.parseInt(split[8]));
                           centralbank.cards.get(j).setMojoodi(   centralbank.cards.get(j).getMojoodi()+Integer.parseInt(split[8]));
                       }
                   }
               }
               else
                   System.out.println("your card doesnt exist or your pass is incorrect or the amount is forbidden or your mojoodi is not enough");
           }
       }
       if(split.length==10){
           for(int i=0;i<centralbank.cards.size();i++){
               if(centralbank.cards.get(i).AccountID.equalsIgnoreCase(split[6])&&centralbank.cards.get(i).bank.name.equalsIgnoreCase(split[5])&&centralbank.cards.get(i).person.Nationalcode.equalsIgnoreCase(split[7])&& centralbank.cards.get(i).Mojoodi>=Integer.parseInt(split[9])){

                   for(int j=0;j<centralbank.cards.size();j++){
                       if(centralbank.cards.get(j).AccountID.equalsIgnoreCase(split[8])){
                           centralbank.cards.get(i).setMojoodi( centralbank.cards.get(i).Mojoodi-Integer.parseInt(split[9]));
                           centralbank.cards.get(j).setMojoodi(   centralbank.cards.get(j).Mojoodi+Integer.parseInt(split[9]));
                       }
                   }
               }
               else
                   System.out.println("your card doesnt exist or your pass is incorrect or the amount is forbidden or your mojoodi is not enough");
           }
       }

   }
   void recieveloan(String[] split){
        int a=0;
        for(int i=0;i<realperson.size();i++){
            if(realperson.get(i).getNationalcode().equalsIgnoreCase(split[3])&&realperson.get(i).age(now)>=18){
                for(int j=0;j<realperson.get(i).Cards.size();j++){
                    if(realperson.get(i).Cards.get(j).getBank().getName().equalsIgnoreCase(split[2])&&realperson.get(i).Cards.get(j).Mojoodi*5>=Integer.parseInt(split[4])){
Loan loan=new Loan(realperson.get(i),Integer.parseInt(split[4]),now.toString(),realperson.get(i).Cards.get(j).getBank(),realperson.get(i).Cards.get(j));

                        centralbank.loan.add(loan);
                        realperson.get(i).loans.add(loan);
                        realperson.get(i).Cards.get(j).getBank().listofloan.put(realperson.get(i),  realperson.get(i).loans);
                        centralbank.listofloan.put(realperson.get(i),  realperson.get(i).loans);

                        a=1;
                    }
                }

            }

        }
       for(int i=0;i<legalperson.size();i++){
           if(legalperson.get(i).getNationalcode().equalsIgnoreCase(split[3])){
               for(int j=0;j<legalperson.get(i).Cards.size();j++){
                   if(legalperson.get(i).Cards.get(j).getBank().getName().equalsIgnoreCase(split[2])&&legalperson.get(i).Cards.get(j).getMojoodi()*5<=Integer.parseInt(split[4])){
                       Loan loan=new Loan(legalperson.get(i),Integer.parseInt(split[4]),now.toString(),legalperson.get(i).Cards.get(j).getBank(),legalperson.get(i).Cards.get(j));
                       centralbank.loan.add(loan);
                       legalperson.get(i).loans.add(loan);
                       legalperson.get(i).Cards.get(j).getBank().listofloan.put(legalperson.get(i),  legalperson.get(i).loans);
                       centralbank.listofloan.put(legalperson.get(i),  legalperson.get(i).loans);

                       a=1;
                   }
               }

           }

       }
       if(a==0) System.out.println("something is wrong");
   }
   void pardakhtloan(String[] split){
        int a=0;
        for(int i=0;i<realperson.size();i++){
            if(realperson.get(i).getNationalcode().equalsIgnoreCase(split[5])){
               for(int j=0;j<realperson.get(i).loans.size();j++){
                   if(realperson.get(i).loans.get(j).bank.getName().equalsIgnoreCase(split[4])){
                       realperson.get(i).loans.get(j).setBargardandeshode(realperson.get(i).loans.get(j).bargardandeshode+Integer.parseInt(split[6]));
                       a=1;
                   }
               }
            }

        }
       for(int i=0;i<legalperson.size();i++){
           if(legalperson.get(i).getNationalcode().equalsIgnoreCase(split[5])){
               for(int j=0;j<legalperson.get(i).loans.size();j++){
                   if(legalperson.get(i).loans.get(j).bank.getName().equalsIgnoreCase(split[4])){
                       legalperson.get(i).loans.get(j).setBargardandeshode(realperson.get(i).loans.get(j).bargardandeshode+Integer.parseInt(split[6]));
                  a=1;
                   }
               }
           }

       }
       if(a==0)
           System.out.println("something is wrong");
   }
   void showallbanks(){
    for(int i=0;i<centralbank.banks.size();i++){
        System.out.println(centralbank.banks.get(i).toString());
    }
   }
    void showallrealperson(){
        for(int i=0;i<realperson.size();i++){
            System.out.println(realperson.get(i).toString());
        }
    }
    void showalllegalperson(){
        for(int i=0;i<legalperson.size();i++){
            System.out.println(legalperson.get(i).toString());
        }
    }
    void showallaccount(){
        for(int i=0;i<centralbank.account.size();i++){
            System.out.println(centralbank.account.get(i).toString());
        }
    }
    void showallloan(){
        for(int i=0;i<centralbank.loan.size();i++){
            System.out.println(centralbank.loan.get(i).toString());
        }
    }
    void showallhesabshakhs(String[] split){
        int a=0;
        for(int i=0;i<realperson.size();i++){
            if(realperson.get(i).getNationalcode().equalsIgnoreCase(split[3])){
                for(int j=0;j<realperson.get(i).Hesabha.size();j++){
                    System.out.println(realperson.get(i).Hesabha.get(j).toString());
                    a=1;
                }
            }
        }
        for(int i=0;i<legalperson.size();i++){
            if(legalperson.get(i).getNationalcode().equalsIgnoreCase(split[3])){
                for(int j=0;j<legalperson.get(i).Hesabha.size();j++){
                    System.out.println(legalperson.get(i).Hesabha.get(j).toString());
                    a=1;
                }
            }
        }
        if(a==0) System.out.println("something is wrong");
    }
    static int tabehal(String past,String now){
        String[] splitpast=past.split("\\-");
        String[] splitnow=now.split("\\-");
        return (Integer.parseInt(splitnow[0])-Integer.parseInt(splitpast[0]))*12+Integer.parseInt(splitnow[1])-Integer.parseInt(splitpast[1]);
    }
    void Process(String[] split){
        String Now =now.toString();
        String past=now.toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        LocalDate m;
        if(split.length==3&&split[2].equalsIgnoreCase("day")){
            m=now.plusDays(1);
            now=m;
           Now =now.toString();
        }
      else  if(split.length==3&&split[2].equalsIgnoreCase("month")){
            m=now.plusMonths(1);
            now=m;
            Now =now.toString();
        }else if(split.length==3&&split[2].equalsIgnoreCase("year")){
            m=now.plusYears(1);
            now=m;
            Now =now.toString();
        }else if(split.length==4&&split[3].equalsIgnoreCase("day")){
            m=now.plusDays(Integer.parseInt(split[2]));
            now=m;
            Now =now.toString();
        }else if(split.length==4&&split[3].equalsIgnoreCase("month")){
            m=now.plusMonths(Integer.parseInt(split[2]));
            now=m;
            Now =now.toString();
        }else if(split.length==4&&split[3].equalsIgnoreCase("year")){
            m=now.plusYears(Integer.parseInt(split[2]));
            now=m;
            Now =now.toString();
        }else if(split.length==5){
           

            try { LocalDate mm = LocalDate.parse(split[3], formatter);
                now=mm;
                System.out.println(mm);}
            catch (Exception e){
                System.out.println("something is wrong");}
            Now =now.toString();
        }


for(int i=0;i<centralbank.accountss.size();i++){
   if(centralbank.accountss.get(i).getCard().Activity){
       int months=tabehal(past,Now)-centralbank.accountss.get(i).getTime();
    if(centralbank.accountss.get(i).Short){
        if(tabehal(past,Now)>=12){
            centralbank.accountss.get(i).getCard().setMojoodi((int) ( centralbank.accountss.get(i).getCard().getMojoodi()+centralbank.accountss.get(i).getMojoodi()*0.1*(12-centralbank.accountss.get(i).getTime())));
            centralbank.accountss.get(i).setActivity(false);
        }
        else centralbank.accountss.get(i).getCard().setMojoodi((int) ( centralbank.accountss.get(i).getCard().getMojoodi()+centralbank.accountss.get(i).getMojoodi()*0.1*(months)));
        centralbank.accountss.get(i).setTime(tabehal(past,Now));

    }
    else{
        if(tabehal(past,Now)>=24){
            centralbank.accountss.get(i).getCard().setMojoodi(centralbank.accountss.get(i).getCard().getMojoodi()+(int) (centralbank.accountss.get(i).getMojoodi()*0.1*(24-centralbank.accountss.get(i).getTime())));
            centralbank.accountss.get(i).setActivity(false);
        }
        else centralbank.accountss.get(i).getCard().setMojoodi((int) (centralbank.accountss.get(i).getCard().getMojoodi()+centralbank.account.get(i).getMojoodi()*0.1*(months)));
        centralbank.accountss.get(i).setTime(tabehal(past,Now));

    }
   }
}
        for(int i=0;i<centralbank.loan.size();i++){
          if(centralbank.loan.get(i).Activity){
              int t=0;
              int months=tabehal(past,Now)-centralbank.loan.get(i).getTime();
              while(t<=months&&centralbank.loan.get(i).Activity&&centralbank.loan.get(i).card.getMojoodi()>=(int)(0.025*centralbank.loan.get(i).meghdar)){
                  centralbank.loan.get(i).setBargardandeshode( centralbank.loan.get(i).getBargardandeshode()+(int) (0.025*centralbank.loan.get(i).getMeghdar()));
                  centralbank.loan.get(i).card.setMojoodi(centralbank.loan.get(i).card.Mojoodi-(int) (0.025*centralbank.loan.get(i).getMeghdar()));
                  t++;
                  if(centralbank.loan.get(i).getDarsadbahre()*centralbank.loan.get(i).getMeghdar()>= 100*centralbank.loan.get(i).getBargardandeshode()){
                      centralbank.loan.get(i).Activity=false;}
              }
              if(centralbank.loan.get(i).Activity &&t<months){
                  centralbank.loan.get(i).setDarsadbahre(centralbank.loan.get(i).getDarsadbahre()+2*(months-t));
              }
              centralbank.loan.get(i).setTime(tabehal(past,Now));
          }
        }
        for(int i=0;i<centralbank.banks.size();i++){
            int months=tabehal(past,Now)-centralbank.banks.get(i).getTime();
            centralbank.banks.get(i).setInvestment((int) ((int) months*((int)centralbank.banks.get(i).getInvestment()*1.05)));
            centralbank.banks.get(i).time=tabehal(past,Now);
        }
for(int i=0;i<centralbank.cards.size();i++){
   if(centralbank.cards.get(i).Activity){
       LocalDate mm = LocalDate.parse(centralbank.cards.get(i).getDeadDate(), formatter);
       if(now.isAfter(mm)){
           centralbank.cards.get(i).setActivity(false);
       }
   }
}
    }
    void showloan(String[] split){
        for(int i=0;i<centralbank.loan.size();i++){
            if(centralbank.loan.get(i).person.Nationalcode.equalsIgnoreCase(split[6])){
                System.out.println(centralbank.loan.get(i).toString());
            }
        }
    }
    void showSoodDehi(String[] split){
        for(int i=0;i<centralbank.banks.size();i++){
            if(centralbank.banks.get(i).name.equalsIgnoreCase(split[3])){
                System.out.println(centralbank.banks.get(i).interestpercent);
            }
        }
    }
    void showbankbalance(String[] split){
        for(int i=0;i<centralbank.banks.size();i++){
            if(centralbank.banks.get(i).name.equalsIgnoreCase(split[3])){
                System.out.println(centralbank.banks.get(i).Investment);
            }
        }
    }
    void showallbankbalance(){
        int a=0;
        for(int i=0;i<centralbank.banks.size();i++){

             a+=centralbank.banks.get(i).Investment;

        }
        System.out.println(a);
    }
    void showdate(){
        System.out.println(now.toString());
    }
}



