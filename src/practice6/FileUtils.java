package practice6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {

    public static void main(String[] args) throws IOException {
        //goal is to read the file that's created under lib

        Properties properties= new Properties();
        InputStream inputStream= new FileInputStream("src/practice6/lib/config.properties");
        properties.load(inputStream);

        String username=properties.getProperty("username");
        String password= properties.getProperty("password");
        String dbName= properties.getProperty("dbName");

        System.out.println(username+" "+password+" "+dbName);

    }
}
