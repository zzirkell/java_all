package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Create car \n0.Exit");
        int fuel = scan.nextInt();
        while (fuel != 0){
            System.out.println("Enter your car mark: ");
            Car car_1 = new Car();
            String dob = scan.next();
            car_1.mark = dob;
            if (dob != null){
                System.out.println("Now choose complectation:");
                System.out.println("1.Luxe \n2.Presige\n3.Premium_plus\n4.Premium");
                int comp_number = scan.nextInt();
                System.out.println("Complectation for " + car_1.mark);
                Comlectation comp_1 = new Comlectation();
                if (comp_number == 1){
                    comp_1.print_Comp("Luxe");
                }
                if (comp_number == 2){
                    comp_1.print_Comp("Presige");
                }
                if (comp_number == 3){
                    comp_1.print_Comp("Premium_plus");
                }
                if (comp_number == 4){
                    comp_1.print_Comp("Premium");
                }
            }
            System.out.println("1.Create car \n0.Exit");
            fuel = scan.nextInt();
        }


    }
}
