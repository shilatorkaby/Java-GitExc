//Validates client requests
//Can update user data (email/name/password) - via UserService
//Can delete a user - via UserService
public class UserService implements UserController {
    public void makeNewUser(String email, String password, String name) {
        User user = new User(email, password, name);
    }


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
}

