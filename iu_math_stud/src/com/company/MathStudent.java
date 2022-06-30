package com.company;

public class MathStudent extends Student {
    public MathStudent(String name,int course,int mark){
        super(name,course,mark);
    }
    public String writeExam(){
        return "У студента с факультета Математика идёт экзамен";
    }
}
