import java.util.Scanner;

public class InputProcessor {
    Bankmanager Manager;
    InputProcessor(Bankmanager Manager){
        this.Manager=Manager;
    }
    public void run() {
        String input;
        Scanner scanner = new Scanner(System.in);
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            if (input.startsWith("add person")) {
                Manager.AddRealPerson(input.split("\\s"));
            } else if (input.startsWith("add company")) {
                Manager.AddLegalPerson(input.split("\\s"));
            } else if (input.startsWith("add bank")) {
                Manager.AddBank(input.split("\\s"));
            } else if (input.startsWith("Set bank income percent")) {
                Manager.nerkhedaramad(input.split("\\s"));
            } else if (input.startsWith("Set bank interest percent")) {
                Manager.SoodDehi(input.split("\\s"));
            } else if (input.startsWith("increase bank balance")) {
                Manager.Addinvestmentforbank(input.split("\\s"));
            } else if (input.startsWith("Open current account")) {
                Manager.OpenCard(input.split("\\s"));
            } else if (input.startsWith("Open deposit account")) {
                Manager.OpenAccounts(input.split("\\s"));
            } else if (input.startsWith("Close account")) {
                Manager.close(input.split("\\s"));
            } else if (input.startsWith("Change card password")) {
                Manager.ChangeCardPass(input.split("\\s"));
            } else if (input.startsWith("Set card second password")) {
                Manager.SeconPassActivation(input.split("\\s"));
            } else if (input.startsWith("Change card second password")) {
                Manager.ChangeSecondCardPass(input.split("\\s"));
            } else if (input.startsWith("Extend the expiration date")) {
                Manager.tamdid(input.split("\\s"));
            } else if (input.startsWith("Deposit money")) {
                Manager.variz(input.split("\\s"));
            } else if (input.startsWith("Withdraw money")) {
                Manager.daryaftvajh(input.split("\\s"));
            } else if (input.startsWith("Get account balance")) {
                Manager.estelammojoodi(input.split("\\s"));
            } else if (input.startsWith("Transfer money to another account")) {
                Manager.enteghalevajh(input.split("\\s"));
            } else if (input.startsWith("Receive loan")) {
                Manager.recieveloan(input.split("\\s"));
            } else if (input.startsWith("Pay off the loan")) {
                Manager.pardakhtloan(input.split("\\s"));
            } else if (input.startsWith("Go next")) {
                Manager.Process(input.split("\\s"));
            } else if (input.startsWith("Show all banks")) {
                Manager.showallbanks();
            } else if (input.startsWith("Show all persons")) {
                Manager.showallrealperson();
            } else if (input.startsWith("Show all companies")) {
                Manager.showalllegalperson();
            } else if (input.startsWith("Show all accounts")) {
                Manager.showallaccount();
            } else if (input.startsWith("Show all loans")) {
                Manager.showallloan();
            } else if (input.startsWith("Show accounts for")) {
                Manager.showallhesabshakhs(input.split("\\s"));
            }
            else if (input.startsWith("Show details of the loan for")) {
                Manager.showloan(input.split("\\s"));
            } else if (input.startsWith("Show bank interest")) {
                Manager.showSoodDehi(input.split("\\s"));
            } else if (input.startsWith("Show bank balance")) {
                Manager.showbankbalance(input.split("\\s"));
            } else if (input.startsWith("Show central bank")) {
                Manager.showallbankbalance();
            } else if (input.startsWith("Show date")) {
                Manager.showdate();
            } else {
                System.err.println("Invalid Input!");

            }
        }
        }
    }


