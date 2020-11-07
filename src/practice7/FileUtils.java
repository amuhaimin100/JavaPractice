package practice7;

import java.io.*;
import java.util.Properties;

public class FileUtils {

    public static String getPropertyFromFile(String filePath, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        String data = properties.getProperty(key);
        return data;
    }

   // public String getDataFromTextFile()



    public static void main(String[] args) throws IOException {

        String tmpContainer;
        String finalText="";

        FileReader fileReader= new FileReader("src/practice7/lib/today.txt");
        BufferedReader bufferedReader= new BufferedReader(fileReader);

        while((tmpContainer= bufferedReader.readLine())!=null){
            finalText=finalText+"\n"+tmpContainer;
        }
        System.out.println(finalText);

    }
}
