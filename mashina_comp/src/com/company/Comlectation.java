package com.company;

public class Comlectation {
    boolean ABS;
    String privod;
    String salon;
    boolean sunroof;
    int horsepower;

    void print_Comp(String name_comp){
        if (name_comp == "Luxe"){
            privod = "pered";
            salon = "tkan";
            ABS = false;
            sunroof = false;
            horsepower = 130;
        }
        if (name_comp == "Prestige"){
            privod = "pered";
            salon = "tkan";
            ABS = true;
            sunroof = false;
            horsepower = 150;
        }
        if (name_comp == "Premium_plus"){
            privod = "poln";
            salon = "tkan_leaser";
            ABS = true;
            sunroof = false;
            horsepower = 150;
        }
        if (name_comp == "Premium"){
            privod = "poln";
            salon = "leaser";
            ABS = true;
            sunroof = true;
            horsepower = 200;
        }

        System.out.println("in " + name_comp + " we have: ");
        System.out.println("privod = " + privod + "\nsalon = " + salon + "\nABS = " + ABS + "\nsunroof = " + sunroof + "\nhorsepower = " + horsepower );
        System.out.println("");
    }

}
