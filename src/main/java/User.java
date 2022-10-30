import com.github.javafaker.IdNumber;

import java.util.concurrent.ThreadLocalRandom;

//Need to get a token from Auth Service
class User {
ProjectRandom random;
final Integer id;
String email;
String password;
String name;

    public User(String email, String password, String name) {
        this.id= getRandomId();
        this.email = getRandomEmail();
        this.password = password;
        this.name = name;
    }
    public User(String password, String name) {
        this.id= getRandomId();
        this.email = getRandomEmail();
        this.password = password;
        this.name = name;
    }


        String getRandomEmail(){return(name+ ThreadLocalRandom.current().nextInt(100, 999)+"@gmail.com");}

        Integer getRandomId(){return (ThreadLocalRandom.current().nextInt(100000000, 99999999));}

        public String getFirstName() {
            return name;
        }

    String getPassword(){return password;}
    String getEmail(){return email;}
    String getName(){return name;}
    Integer getId(){return id;}
    void setPassword(String password){this.password=password;}
    void setEmail(String email){this.email=email;}
    void setName(String name){this.name=name;}
}
