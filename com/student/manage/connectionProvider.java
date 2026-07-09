package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionProvider {
    //Create Connection
    static Connection con;
    public static Connection createConnection(){
            try {
                // load Class
                Class.forName("com.mysql.cj.jdbc.Driver");


                //Create Connection
                String url = "jdbc:mysql://localhost:3306/student_manage";
                String username ="root";
                String password ="apnacollegedsa9229";
                 con = DriverManager.getConnection(url,username,password);



            }catch (Exception e){
                e.printStackTrace();
            }
            return con;
    }
}
