package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class TestBatch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/pygman","root","******");
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO loguser VALUES (?,?,?)");
            connection.setAutoCommit(false);
            for (int i=0;i<100000;i++){
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2, "admin" + i);
                preparedStatement.setString(3,"admin"+i);
                preparedStatement.addBatch();
                if(i%1000==0){
                    preparedStatement.executeBatch();
                    connection.commit();
                    preparedStatement.clearBatch();
                }
            }
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
