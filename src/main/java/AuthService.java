import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AuthService {
    public AuthService() {
        //UserToken = new HashMap<>();
    }
    //create user in user repository
    //Validates user details after logging in
    //change boolean to return token (string)
//    boolean validateLogin(String email,Integer id)
//    {
//        for (Map.Entry<Integer,String> entry : UserToken.entrySet())
//            if (entry.getValue()==email && entry.getKey()== id)
//                return true;
//        return false;
//    }

    public static void main(String[] args) {
    }

    public String getEmail() {
        return null;
    }


    public String password() {
        return null;
    }


    public boolean validateRequest(String email, String password) {
        return false;
    }

    public String getToken(User user){
        return UserRepository.getUserToken(user.id);
    }


    public void addUserToRepo(User user){
        UserRepository.addUserToRepo(user);
    }

    public void createUser(String email, String name, String password) {
        User user = new User(email, password, name);
    }

    public void addToMap(int id, String token) {
        UserRepository.addUserToMap(id,token);
    }
}
