public interface UserController {
    void updateEmail(String email,String token);
    void updateName(String name,String token);
    void updatePassword(String password,String token);
    void deleteUser(String email,String password);

    //in the future - the user service will do any action only with attached token.
}
