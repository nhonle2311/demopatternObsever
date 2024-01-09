package obsever;

public class Mail implements Obsever{
    public void update(String message){
        System.out.println("Mail: update");
    }

}

