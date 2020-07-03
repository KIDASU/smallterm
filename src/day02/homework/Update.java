package day02.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 19:28
 **/

public class Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driverName="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=utf-8&useSSL=true";

        Connection connection = null ;
        PreparedStatement preparedStatement = null ;

        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,"root","123456");
            String sqlString = "UPDATE tab_student SET stu_name=?,stu_idcard=?,stu_birthday=?,stu_phone=? WHERE stu_id=?";

            preparedStatement = connection.prepareStatement(sqlString);

            preparedStatement.setString(1,"zs");
            preparedStatement.setString(2,"3502199901011234");
            preparedStatement.setString(3,"1999-01-01");
            preparedStatement.setString(4,"12345678990");
            preparedStatement.setString(5,"10003");
            int i = preparedStatement.executeUpdate();
            if(i==1){
                System.out.println("插入成功！");
            }else{
                System.out.println("插入失败！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }



    }


}
