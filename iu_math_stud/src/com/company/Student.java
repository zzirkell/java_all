package com.company;

public abstract class Student {
    protected String name;
    protected int course;
    protected int mark;

    public Student(String name,int course,int mark){
        this.name=name; //текущий элемент
        this.course=course;
        this.mark=mark;
        PrintStudent();
    }



    public abstract String writeExam();



    public void PrintStudent(){
        System.out.println("ФИО студента:"+this.name+"\nкурс студента: "+this.course+"\nоценка студента: "+this.mark+"\n"+this.writeExam());
    }

}
