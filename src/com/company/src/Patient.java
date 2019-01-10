package com.company.src;

import java.util.Objects;

public class Patient {
    private String firstName;
    private String lastName;
    private String ssn;
    private String registerationNumber;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String ssn, String registerationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.registerationNumber = registerationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String  getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String  getRegisterationNumber() {
        return registerationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        this.registerationNumber = registerationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(getFirstName(), patient.getFirstName()) &&
                Objects.equals(getLastName(), patient.getLastName()) &&
                Objects.equals(getSsn(), patient.getSsn()) &&
                Objects.equals(getRegisterationNumber(), patient.getRegisterationNumber());
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn=" + ssn +
                ", registerationNumber=" + registerationNumber +
                "}\n";
    }
}
