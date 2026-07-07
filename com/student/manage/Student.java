package com.student.manage;

public class Student{
private int StudentId ;
private  String StudentName;
private  String StudentPhone;
private  String StudentCity;


    public String getStudentCity() {
        return StudentCity;
    }

    public void setStudentCity(String studentCity) {
        StudentCity = studentCity;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentPhone() {
        return StudentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        StudentPhone = studentPhone;
    }


    public Student(int studentId, String studentName, String studentPhone, String studentCity) {
        this.StudentId = studentId;
        this.StudentName = studentName;
        this.StudentPhone = studentPhone;
        this.StudentCity = studentCity;
    }

    public Student( String studentName, String studentPhone, String studentCity) {
        this.StudentName = studentName;
        this.StudentPhone = studentPhone;
        this.StudentCity = studentCity;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentCity='" + StudentCity + '\'' +
                ", StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentPhone='" + StudentPhone + '\'' +
                '}';
    }



}
