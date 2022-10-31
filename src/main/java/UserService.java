//Validates client requests
//Can update user data (email/name/password) - via UserService
//Can delete a user - via UserService
public class UserService implements UserController {

    String loginToUser(String email, String password) {
        //get token (after validation) from auth-service by password and email
        return "token"; //return token
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

