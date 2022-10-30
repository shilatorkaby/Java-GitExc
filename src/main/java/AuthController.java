import java.util.concurrent.ThreadLocalRandom;

public interface AuthController {

    String getEmail(); //return the user email
    String password(); //return the user password
    boolean validateRequest(String email,String password) ;//validates client request check if name match to password
//instead boolean we will return token



    //perform actions

}
