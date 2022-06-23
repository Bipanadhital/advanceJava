/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author User
 */
public class StudentController {
  private Student student;
  private StudentView studentView;
  public StudentController(Student student,StudentView studentView){
     this.student = student;
     this.studentView = studentView;
  }
  public void setName(String name)
  {
     this.student.setName(name);
  }
  public void setId(String id)
  {
     this.student.setId(id);
  }
  public void setEmail(String email)
  {
     this.student.setEmail(email);
  }
  public String getName(){
      return student.getName();
  }
  public String getId(){
      return student.getId();
  }
  public String getEmail(){
      return student.getEmail();
  }  
  public void displayStudentInfo(){
    studentView.displayStudentDetail(student.getName(), student.getId(), student.getEmail());
  }
    
}
