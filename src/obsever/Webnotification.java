package obsever;

public class Webnotification implements Obsever{
    public void update(String message){
        System.out.println("Webnotification: update");
    }
}
