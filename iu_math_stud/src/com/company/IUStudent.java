package com.company;

public class IUStudent extends Student {
    public IUStudent(String name,int course,int mark){
        super(name,course,mark); //текущий элемент родителя
    }
    public String writeExam(){
        return "У студента с факультета Математика идёт экзамен";
    }


}