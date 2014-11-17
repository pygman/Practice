package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class TestCallable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/pygman","root","******");
            CallableStatement callableStatement=connection.prepareCall("{call AOE.FUNC(?,?)}");
            callableStatement.setString(1,"100");
            callableStatement.setString(2,"TestOne");
            callableStatement.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
