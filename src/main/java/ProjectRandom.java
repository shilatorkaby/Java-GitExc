import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public  class ProjectRandom {
    static int counter = 0;
    static ArrayList<Integer> list = new ArrayList<Integer>();

    static Faker faker = new Faker();

    String getRandomName(){return faker.name().firstName();};
    String getRandomEmail(){return(faker.name().firstName()+ ThreadLocalRandom.current().nextInt(100, 299 + 1)+"@gmail.com");}

    Integer getRandomIdTo1m(){return (ThreadLocalRandom.current().nextInt(100000000, 999999999));}
    String getRandomPassword(){return (faker.name().lastName() + ThreadLocalRandom.current().nextInt(10000, 99999));}

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

