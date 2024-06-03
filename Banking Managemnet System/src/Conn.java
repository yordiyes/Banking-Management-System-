//these are the important libraries
import java.sql.*;

public class Conn{
    Connection connection;
    static Statement statement;
    //the constructor Conn
    public Conn(){
        //the try catch block
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "");
            statement = connection.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}