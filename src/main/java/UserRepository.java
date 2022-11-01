import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//email, name , password

public  class UserRepository {
    static Map<Integer,String> tokens =new HashMap<>();
    static ArrayList<JsonObject> users = new ArrayList<>();
    public static void writeToFile(String email,String name, String password) {
        // create a writer
        BufferedWriter writer = null;
        JsonObject customer;
        try {
            writer = Files.newBufferedWriter(Paths.get("User.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create customer object
        customer = new JsonObject();
        customer.put("email", email);
        customer.put("name", name);
        customer.put("password", password);

        // write JSON to file
        try {
            Jsoner.serialize(customer, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //close the writer
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        users.add(customer);
    }

    public static void addUserToRepo(User user) {
        writeToFile(user);
    }

    public static void writeToFile(User user){
        writeToFile(user.getEmail(), user.getName(), user.getPassword());
    }
    public static void readFromFile(String path)
    {
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get(path));

            // create parser
            JsonObject parser = (JsonObject) Jsoner.deserialize(reader);

            // read User details
            String email = (String) parser.get("email");
            String name = (String) parser.get("name");
            String password = (String) parser.get("password");

            System.out.println(email+" "+name+" "+password);

            //close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //check if key exist in map, if yes-> retuern token.
    //else return null
    static String getUserToken(int key) {
        if(tokens.containsKey(key))
        {
            return tokens.get(key);
        }
        else return null;
    }
    public static User getUserByEmail(String email) {
      User user1 =(User)users.stream().filter(user -> user.containsValue(email));
      return user1;
    }
    public static void addUserToMap(int id, String token) {
        tokens.put(id,token);
    }

    public  void checkIfUserInMap(boolean b, boolean b1) {
    }
}
