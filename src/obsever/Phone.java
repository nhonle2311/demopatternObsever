package obsever;

public class Phone implements Obsever{
    public void update(String message){
        System.out.println("Phone: update");
    }
}
