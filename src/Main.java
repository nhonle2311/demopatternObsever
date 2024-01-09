import obsever.Mail;
import obsever.Phone;
import obsever.Webnotification;
import subject.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Mail mail = new Mail();
        Phone phone = new Phone();
        Webnotification webnotification = new Webnotification();
        account.add(mail);
        account.add(phone);
        account.add(webnotification);
        account.notifyObsever("alo alo");
    }
}