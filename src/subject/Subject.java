package subject;
import obsever.Obsever;
public interface Subject {
    void addObsever(Obsever obsever) ;
    void removeObsever(Obsever obsever);
    void notifyObsever();
}
