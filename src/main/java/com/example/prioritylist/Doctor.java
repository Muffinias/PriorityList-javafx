package com.example.prioritylist;

public class Doctor implements Person{
    //all the functions for Doctor class and all classes that extend it

    private String name;

    private final String occupation = "Doctor";

    private int age;

    private String field;

    public Doctor(){}

    public Doctor(String n, int a){
        this.name=n;
        this.age=a;
    }

    public void setName(String n){
        this.name=n;
    }

    public void setAge(int a){
        this.age=a;
    }

    public void setField(String f){
        this.field=f;
    }

    public String getName(){
        return name;
    }

    public String getOccupation(){
        return occupation;
    }

    public int getAge(){
        return age;
    }

    public String getField(){
        return field;
    }

    public String toString(){
        return "Doctor name: "+name+"\n"
                +"Doctor age: "+age+"\n"
                +"Doctor field of expertise: "+field;
    }
}
