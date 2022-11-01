import java.util.concurrent.ThreadLocalRandom;

//Validates client requests
//Can update user data (email/name/password) - via UserService
//Can delete a user - via UserService
public class UserService {

    public void updateEmail(String oldMail,String newEmail,String token){
        User user=UserRepository.getUserByEmail(oldMail);
        user.setEmail(newEmail);
    }
    public void updateName(String name,String token) {

    }

    public void updatePassword(String password,String token) {

    }

    public void deleteUser(String email, String password) {

    }

}

