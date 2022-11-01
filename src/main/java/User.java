import com.github.javafaker.IdNumber;

import java.util.concurrent.ThreadLocalRandom;

//Need to get a token from Auth Service
class User {
final Integer id;
String email;
String name;
String password;

    ProjectRandom random = new ProjectRandom();

    public User(String email, String password, String name) {
        this.id = random.getRandomIdTo1m();
        this.email = email;
        this.password = password;
        this.name = name;
    }
    public User(String password, String name) {
        this.id= random.getRandomIdTo1m();
        this.email = random.getRandomEmail();
        this.password = password;
        this.name = name;
    }
    public User(String email) {
        this.id= random.getRandomIdTo1m();
        this.email = email;
        this.password = random.getRandomPassword();
        this.name = random.getRandomName();
        getPassword();
    }


        public String getFirstName() {
            return name;
        }

    String getPassword(){return this.password;}
    String getEmail(){return this.email;}
    String getName(){return this.name;}
    Integer getId(){return this.id;}
    void setPassword(String password){this.password=password;}
    void setEmail(String email){this.email=email;}
    void setName(String name){this.name=name;}
}
