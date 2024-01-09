package subject;
import obsever.Mail;
import obsever.Obsever;
import java.util.ArrayList;
import java.util.List;
public class Account implements Subject{
    private List<Obsever> obsevers = new ArrayList<Obsever>();
    public void addObsever(Obsever obsever) {
        obsevers.add(obsever);
    }
    public void removeObsever(Obsever obsever) {
        obsevers.remove(obsever);
    }
    public void notifyObsever(String message) {
        for (Obsever obsever : obsevers) {
            obsever.update("Account: update");
        }
    }
}
