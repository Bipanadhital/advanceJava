/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author User
 */
public class MVCMain {
  public static void main(String[] agrs){
    Student student = GetStudent();
    StudentView studentView=new StudentView();
    StudentController sc = new StudentController(student, studentView);
    sc.displayStudentInfo();
  }
  public static Student GetStudent(){
    Student student = new Student();
    student.setName("Prabin");
    student.setId("2019-1");
    student.setEmail("prabin@gmai.com");
    return student;
  }
}
