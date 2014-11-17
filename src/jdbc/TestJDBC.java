package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by pygmalion on 2014/11/12.
 */
public class TestJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/pygman","root","******");
        Statement statement=connection.createStatement();
////        CREATE
//        statement.executeUpdate("CREATE TABLE aoe (uuid VARCHAR(20) PRIMARY KEY,username VARCHAR(20),password VARCHAR(20) )");
////        INSERT
//        statement.executeUpdate("INSERT INTO aoe VALUES (1 ,'admin','admin')");
//        statement.executeUpdate("INSERT INTO aoe VALUES (2 ,'scott','tigger')");
////        UPDATE
//        statement.executeUpdate("UPDATE aoe SET username='admin1',password='admin1' WHERE uuid=1");
////        SELECT
//        ResultSet resultSet=statement.executeQuery("SELECT * FROM aoe");
//        while (resultSet.next()){
//            String username=resultSet.getString("username");
//            String password=resultSet.getString("password");
//            System.out.println("username:"+username+".password:"+password);
//        }
////        DELETE
//        statement.executeUpdate("DELETE FROM aoe WHERE username='scott'");
//        statement.close();
//        connection.close();
    }
}
