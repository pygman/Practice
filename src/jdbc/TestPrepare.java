package jdbc;

import java.sql.*;

/**
 * Created by pygmalion on 2014/11/12.
 */
public class TestPrepare {
    public static void main(String[] args) {
        ResultSet resultSet=null;
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/pygman","root","******");
            String sql="SELECT * FROM loguser WHERE username=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"admin1");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("uuid")+";;;"+resultSet.getString(2)+";;;"+resultSet.getString(3));
            }
        }catch(Exception exception){
            exception.printStackTrace();
        }finally{
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
