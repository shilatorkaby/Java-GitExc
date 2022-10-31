import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AuthService implements AuthController {
    Map<Integer,String> UserToken; //move to userRepository

    public AuthService() {
        UserToken = new HashMap<>();
    }
    //create user in user repository

    //Validates user details after logging in
    //change boolean to return token (string)
    boolean validateLogin(String email,Integer id)
    {
        for (Map.Entry<Integer,String> entry : UserToken.entrySet())
            if (entry.getValue()==email && entry.getKey()== id)
                return true;
        return false;
    }

    public static void main(String[] args) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String password() {
        return null;
    }

    @Override
    public boolean validateRequest(String email, String password) {
        return false;
    }
}
