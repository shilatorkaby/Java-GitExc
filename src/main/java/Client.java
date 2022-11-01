//communication with controller
public class Client {
    public static void main(String[] args) {
        AuthController authController= new AuthController();
        UserController userController= new UserController();
        authController.registerUser("dalya1812@gail.com", "dalia", "056");
        userController.updateEmail("dalya1812@gail.com","dal@gmail.com", "056");


    }
}
