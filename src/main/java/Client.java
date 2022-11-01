//communication with controller
public class Client {
    public static void main(String[] args) {
        AuthController authController= new AuthController();
        authController.registerUser("dalya1812@gail.com", "dalia", "056");
        authController.loginToUser("dalya1812@gail.com", "056");
    }
}
