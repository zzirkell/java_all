package com.company;

public class Singleton {

    private static Singleton one_time_change;

    private Singleton(){};

    public static Singleton createObject(){
        if (one_time_change == null){
            one_time_change = new Singleton();
        }
        return one_time_change;
    }
}

