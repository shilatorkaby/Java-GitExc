import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
//email, name , password

public class UserRepository {
    public static void writeToFile(String email,String name, String password) {

        // create a writer
        BufferedWriter writer = null;
        try {
            writer = Files.newBufferedWriter(Paths.get("User.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create customer object
        JsonObject customer = new JsonObject();
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

    public static void main(String[] args) {
        readFromFile("C:\\Users\\שילת\\IdeaProjects\\Java-GitExc\\src\\main\\java\\file.json");

        writeToFile("shilat@hi","shilat","1234");
    }
}
