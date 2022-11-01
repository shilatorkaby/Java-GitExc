public class UserController {
    UserService userService= new UserService();
    AuthController authController= new AuthController();
    public void updateEmail(String oldMail,String newEmail,String password) {
        String token = authController.loginToUser(oldMail,password);
        if (authController.validateUser(oldMail,token)){
            userService.updateEmail(oldMail,newEmail,token);
        }
        else throw new RuntimeException("Oops, that's not a match. please try again");
    }
    void updateName(String name,String token){

    }
    void updatePassword(String password,String token){

    }
    void deleteUser(String email,String password){

    }

    void makeNewUser(){

    }


    //in the future - the user service will do any action only with attached token.
}
