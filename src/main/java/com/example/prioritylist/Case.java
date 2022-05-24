package com.example.prioritylist;

public class Case {
    private Patient patient;
    private Doctor doctor;
    private int priority;

    public Case(Patient p, Doctor d, int pr){
        this.patient=p;
        this.doctor=d;

        if(pr<1)
            this.priority=1;
        else if(pr>3)
            this.priority=3;
        else
            this.priority=pr;
    }

    public void setPatient(Patient p){
        this.patient=p;
    }

    public void setDoctor(Doctor d){
        this.doctor=d;
    }

    public void setPriority(int p){
        if(p<1)
            this.priority=1;
        else if(p>3)
            this.priority=3;
        else
            this.priority=p;
    }

    public Patient getPatient(){
        return patient;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public int getPriority(){
        return priority;
    }
}
