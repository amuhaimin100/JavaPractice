package practice6;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnectivity {

    //hw: try to find out how can we reuse the same code here again like we did it DatabaseConnectivity2


    public static void main(String[] args) throws SQLException {


        String username ="root";
        String password="Root123$";
        String dbName= "peoplentech";

        String query= "select * from students;";

        //jdbc:mysql---> drivername
        //localhost--->host of the server
        //3306--->port number of the db
        //"?serverTimezone=UTC" if you get exception with time zone

        String url= "jdbc:mysql://localhost:3306/"+dbName+ "?serverTimezone=UTC";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        ResultSet resultSet= statement.executeQuery(query);
        ArrayList<ArrayList<Object>>studentInformation= new ArrayList<>();

        while (resultSet.next()){
            int id =resultSet.getInt("id");
            String names= resultSet.getString("names");
            String location= resultSet.getString("location");

            System.out.println(id+" "+names+" "+location);

            ArrayList<Object> student= new ArrayList<>();
            student.add(id);
            student.add(names);
            student.add(location);

            studentInformation.add(student);

        }
        System.out.println(studentInformation);

        //hw try to store into:
        // the HashMap<String,String>
        //HashMap<Integer, HashMap<Integer, String>>

    }
}
