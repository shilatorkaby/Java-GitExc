import java.util.concurrent.ThreadLocalRandom;

//Validates client requests
//Can update user data (email/name/password) - via UserService
//Can delete a user - via UserService
public class UserService implements UserController {
    String loginToUser(String email, String password) {
        //get token (after validation) from auth-service by password and email
        // return "token"; //return token
    public void makeNewUser(String email, String password, String name) {
        User user = new User(email, password, name);
    }
    //check if user exist in map. if yes-> ask for get the exist token
    //else generate token.
    //get token (after validation) from auth-service by password and email
    String loginToUser(String email, String password) {
       User user = getUserByEmail(email);
       if(checkIfUserInMap){
           return getUserToken;
       }
       else {
          return generateToken(user.id);
       }
    }
    @Override
    public void updateEmail(String email,String token) {
    }
    @Override
    public void updateName(String name,String token) {

    }

    @Override
    public void updatePassword(String password,String token) {

    }

    @Override
    public void deleteUser(String email, String password) {

    }

    private String generateToken(int id){
        return String.valueOf(ThreadLocalRandom.current().nextInt(100000000, 999999999));
    }

    @Override
    public void makeNewUser() {
    }

    @Override
    public void makeNewUser(String email, String name, String password) {
        User user = new User(email, password, name);
    }
    @Override
    public void makeNewUser(String name, String password) {
        User user = new User(password, name);
    }
    @Override
    public void makeNewUser(String email) {
        User user = new User(email);
    }
}

