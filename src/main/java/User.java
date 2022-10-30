//Need to get a token from Auth Service
public class User {
Integer id;
String email;
String password;
String name;

    public User(Integer id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    String getPassword(){return password;};
    String getEmail(){return email;};
    String getName(){return name;};
    Integer getId(){return id;};
}
