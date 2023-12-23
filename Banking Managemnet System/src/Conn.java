import java.sql.*;

public class Conn{
    Connection connection;
    static Statement statement;
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