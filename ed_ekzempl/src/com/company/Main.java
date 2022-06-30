package com.company;

public class Main {

    public static void main(String[] args) {

        Singleton some_time_change = Singleton.createObject();
        Singleton sec_time_changed = Singleton.createObject();
        Often_class newone = Often_class.createObject();
        Often_class newone_1 = Often_class.createObject();

        System.out.println(some_time_change);
        System.out.println(sec_time_changed);
        System.out.println(Singleton.createObject());

        System.out.println(newone);
        System.out.println(newone_1);

    }
}
