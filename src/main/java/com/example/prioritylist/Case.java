package com.example.prioritylist;

//aggregation relationship. This puts together a doctor and a patient to make a case. this class is also where a priority is
//given. For the sake of this project, the priority cannot be higher than 3 or lower than 1.

import javafx.scene.Group;

import java.util.ArrayDeque;

public class Case {
    private Patient patient;
    private Doctor doctor;
    private int priority;
    private Group group;
    private ArrayDeque<Case>cases = new ArrayDeque<>();

    public Case(Group g,Patient p, Doctor d, int pr){
        this.group=g;
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

    public String toString(){
        return "Doctor:\n" +
                doctor.toString()+"\n" +
                "Patient:\n" +
                patient.toString();
    }

}
