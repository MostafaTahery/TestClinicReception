package com.company.src.tst;

import com.company.src.Patient;

import java.util.Date;

public class TestApplication {
    private Patient patient;
    private TestSpecification testSpecification;
    private Integer result;
    private Date date;

    public TestApplication() {
        date=new Date();
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public TestSpecification getTestSpecification() {
        return testSpecification;
    }

    public void setTestSpecification(TestSpecification testSpecification) {
        this.testSpecification = testSpecification;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "TestApplication{" +
                ", testSpecification=" + testSpecification +
                ", result=" + result +
                "}\n";
    }
}
