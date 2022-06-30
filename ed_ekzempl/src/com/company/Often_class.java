package com.company;

public class Often_class {
    private static Often_class many_time_change;

    public static Often_class createObject(){
            many_time_change = new Often_class();
            return many_time_change;
    }

}
