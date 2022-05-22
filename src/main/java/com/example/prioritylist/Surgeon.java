package com.example.prioritylist;

public class Surgeon extends Doctor{
    private String name;
    private int age;
    private String field="Surgeon";

    public Surgeon(String n,int a){
        this.name=n;
        this.age=a;
    }
}
