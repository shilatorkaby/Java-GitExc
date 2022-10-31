import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class ProjectRandom {
        Faker faker = new Faker();

        String getRandomName(){return faker.name().firstName();};

        String getRandomEmail(){return(faker.name().firstName()+ ThreadLocalRandom.current().nextInt(100, 299 + 1)+"@gmail.com");}


    IdNumber getRandomId(){return faker.idNumber();}

        public String getFirstName() {
            return faker.name().firstName();
        }

    static int counter = 0;
    static ArrayList<Integer> list = new ArrayList<Integer>();

    static Faker faker = new Faker();

    String getRandomName(){return faker.name().firstName();};


    String getRandomEmail(){return(faker.name().firstName()+ ThreadLocalRandom.current().nextInt(100, 299 + 1)+"@gmail.com");}

    Integer getRandomIdTo1m(){return (ThreadLocalRandom.current().nextInt(100000000, 99999999));}
    String getRandomPassword(){return (faker.name().lastName() + ThreadLocalRandom.current().nextInt(10000, 99999));}

    IdNumber getRandomId(){return faker.idNumber();}

    public String getFirstName() {
        return faker.name().firstName();
    }


    public static void initNumbers(){
        for (int i = 0; i < 10; i++) list.add(i);
        Collections.shuffle(list);
    }

    int generateNum() {
        int num = list.get(counter);
        counter++;
        return num;
    }

    }

