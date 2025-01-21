/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author Peggy Para
 */
public class Person {
    private String name;
    private int age;
   private String StudentID;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
   public void StudentDetails(){
    dataDeatil();
    System.out.print("ID:"+ StudentID +"\n");
}

    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }   
  protected void dataDeatil(){
     System.out.print("name:"+ name +"\n");
     System.out.print("age:"+ age +"\n");
}
}

