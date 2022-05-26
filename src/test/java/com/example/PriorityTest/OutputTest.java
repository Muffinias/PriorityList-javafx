package com.example.PriorityTest;

import com.example.prioritylist.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputTest {

    @Test
    public void
    PatientTest_VerifyToString(){
        Patient patient = new Patient("Alex","Lawyer","29","heartburn");

        assertEquals("Patient name: "+patient.getName()+"\n" +
                "Patient occupation: "+patient.getOccupation()+"\n" +
                "Patient age: "+patient.getAge()+"\n" +
                "Reason for visit: "+patient.getProblem(),patient.toString());
    }



}
