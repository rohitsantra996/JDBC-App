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
            System.out.println("press 4 to exit app");

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
                StudentDao.insertStudentToDB(st);
                System.out.println(st);

            } else if (c==2) {
                //delete
            } else if (c==3) {
                //display
            } else if (c==4) {
                //exit

                break;

            }else {

            }


        }
        System.out.println(" Thanks for using Appplication...");
        System.out.println("see you soon...bye bye ");
    }
}