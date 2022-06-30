package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int check=1;
        while (check==1){
            System.out.println("1 Ввести студента\n0 Выход\n");
            check= scan.nextInt();
            if (check==1){
                System.out.println("Факультет студента:\n1 IU\n2 Math");
                int faculty= scan.nextInt();
                if (faculty>0 && faculty<3){
                    Print_Simulation(faculty);
                }
            }
        }
    }

    public static void Print_Simulation(int faculty){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ФИО :");
        String name=scan.nextLine();
        System.out.print("Введите курс студента:");
        int course= scan.nextInt();
        System.out.print("Введите оценку студента:");
        int mark= scan.nextInt();
        System.out.println("");
        switch (faculty){
            case 1:
                IUStudent newIUStudent=new IUStudent(name,course,mark);
                break;
            case 2:
                MathStudent newMathStudent = new MathStudent(name,course,mark);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
