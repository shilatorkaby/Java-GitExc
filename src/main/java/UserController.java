public interface UserController {

    public static void makeNewUser(String email, String password, String name) {
        User user = new User(1, email, password, name);
    }

    public static void makeLoginToUser(String email, int password) {
        loginAuth(email, password);
// need to do login auth in auth controller / service

    }
}
