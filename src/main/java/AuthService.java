import java.util.HashMap;
import java.util.Map;

public class AuthService {
    Map<Integer,String> UserToken;

    public AuthService() {
        UserToken = new HashMap<>();
    }
    //create user in user repository

    //Validates user details when logging in
    boolean validateLogin(String email,Integer id)
    {
        for (Map.Entry<Integer,String> entry : UserToken.entrySet())
            if (entry.getValue()==email && entry.getKey()== id)
                return true;
        return false;
    }

}
