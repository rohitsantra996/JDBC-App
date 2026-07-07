package com.student.manage;

import java.sql.Connection;

public class StudentDao {
    public static void insertStudentToDB(Student st){

      try {
          Connection con = connectionProvider.createConnection();

      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
