//importing the sql library
import java.sql.*;

public class Conn{
    Connection connection;
    static Statement statement;
    //the constructor Conn
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///bankManagementSystem","root","yordanos");
            statement = connection.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}