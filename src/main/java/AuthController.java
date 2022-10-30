import java.util.concurrent.ThreadLocalRandom;

public interface AuthController {

    String getEmail(); //return the user email
    String password(); //return the user password
    boolean validateRequest(String email,String password) ;//validates client request check if name match to password




//name+ThreadLocalRandom.current().nextInt(100, 299 + 1)+"@gmail.com"
    //perform actions

}
