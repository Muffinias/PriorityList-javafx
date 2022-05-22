package com.example.prioritylist;

public class Patient implements Person {
    private String name;

    private String occupation;

    private int age;

    private String problem;

    public Patient(String n, String o, int a, String p){
        this.name=n;
        this.occupation=o;
        this.age=a;
        this.problem=p;
    }
    //setters in case editing is needed by user
    public void setName(String n){
        this.name=n;
    }

    public void setOccupation(String o){
        this.occupation=o;
    }

    public void setAge(int a){
        this.age=a;
    }

    public void setProblem(String p){
        this.problem=p;
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

    public String getProblem(){
        return problem;
    }

    //toString method to make returning easier
    public String toString(){
        return "Patient name: "+name+"\n"
                +"Patient occupation: "+occupation+"\n"
                +"Patient age: "+age+"\n"
                +"Reason for visit: "+problem;
    }
}
