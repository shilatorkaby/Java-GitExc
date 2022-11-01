import java.util.concurrent.ThreadLocalRandom;
public class AuthController {

    AuthService authService = new AuthService();
    public void registerUser (String email, String name, String password){
        //check if need to login
        User user = new User(email,name,password);
        authService.addUserToRepo(user);
    }

//
//    String getEmail(){
//
//    }
//    String password(){
//
//    }
//    boolean validateRequest(String email,String password){
//
//    }
//
    //instead boolean we will return token
    String loginToUser(String email, String password) {
        User user = getUserByEmail(email);
        String token =UserRepository.getUserToken(user.getId());
        if(token != null)
        {
        return token;
        }
        else return generateToken(user.getId());
    }

    private User getUserByEmail(String email)
    {
       return UserRepository.getUserByEmail(email);
    }

    private String generateToken(int id){
        String token =String.valueOf(ThreadLocalRandom.current().nextInt(100000000, 999999999));
        authService.addToMap(id, token);
        return token;
    }
//    private boolean validRegister(){
//    }
//
//    private boolean validLogin(){
//    }
}
