package com.example.prioritylist;

public class Doctor implements Person{
    //all the functions for Doctor class and all classes that extend it

    private String name;

    private final String occupation = "Doctor";

    private String age;

    private String field;

    public Doctor(){}

    public Doctor(String n, String a, String f){
        this.name=n;
        this.age=a;
        this.field=f;
    }

    public void setName(String n){
        this.name=n;
    }

    public void setAge(String a){
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

    public String getAge(){
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
