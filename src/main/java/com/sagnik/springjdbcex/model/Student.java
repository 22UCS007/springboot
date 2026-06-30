package com.sagnik.springjdbcex.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//by default all the beans are singleton but if we want to create a new object every time then we can use prototype scope
public class Student {
    private int rollNo;
    private String name;
    private int marks;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getMarks() {return marks;}
    public void setMarks(int marks) {this.marks = marks;}
    public int getRollNo() {return rollNo;}
    public void setRollNo(int rollNo) {this.rollNo = rollNo;}
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
