import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String url= "jdbc:mysql://localhost:3360/Name_of_database";//This is url of database which you create in mysql
        String username="User_name";//your sql's username
        String pasword="SQL_Pasword";//pasword of your sql

        try(Connection connection = DriverManager.getConnection(url, username, pasword)){
            //if url username and pasword is matched by drivermanager then this massage will print
            System.out.println("Connected to the databse");
            System.out.println(connection);
        }
        catch(SQLException e){
            System.out.println("conection faild:"+ e.getMessage());//e.getMassage will show that actual problem with you conection
        }

    }
}