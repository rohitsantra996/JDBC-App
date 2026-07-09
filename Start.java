import com.student.manage.Student;
import com.student.manage.StudentDao;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to add student ");
            System.out.println("Press 2 to delete student ");
            System.out.println("press 3 to display student ");
            System.out.println("Press 4 to display student");
            System.out.println("press 5 to exit app");

            int c = Integer.parseInt(br.readLine());
            
            if(c == 1){
                //add
                System.out.println("Enter user name ");
                String name = br.readLine();

                System.out.println("Enter user phone no");
                String phone = br.readLine();

                System.out.println("Enter user city ");
                String city = br.readLine();

                Student st = new Student(name , phone , city);
                boolean answer = StudentDao.insertStudentToDB(st);
                if (answer){
                    System.out.println("Student Succefully added....");
                }else {
                    System.out.println("Something went wrong ....");
                }
                System.out.println(st);

            } else if (c==2) {
                //delete
                System.out.println("Enter student id to delete");
                int userId = Integer.parseInt(br.readLine());
                  boolean deleted = StudentDao.deleteStudent(userId);
                  if (deleted){
                      System.out.println("Deleted......");

                  }else {
                      System.out.println("Something went wrong...");
                  }
            } else if (c==3) {
                //display
              boolean s = StudentDao.showAllStudent();
              if (s){
                  System.out.println("displayed ......");
              }else {
                  System.out.println("Something Wrong......");
              }
            } else if (c==4) {
                //update
                System.out.println("Enter id ");
                int id = Integer.parseInt(br.readLine());

                System.out.println("Enter city for update  ");
                String city = br.readLine();
              boolean b=  StudentDao.UpdateTable(city ,id);
                         if (b){
                             System.out.println("Updated .....");

                         }else {
                             System.out.println("something went wrong ......");
                         }

                break;

            }else {

            }


        }
        System.out.println(" Thanks for using Appplication...");
        System.out.println("see you soon...bye bye ");
    }
}