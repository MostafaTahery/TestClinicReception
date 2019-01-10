package com.company.src;

import com.company.src.tst.NormalRange;
import com.company.src.tst.TestApplication;
import com.company.src.tst.TestSpecification;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    private static List<Patient> patients = new ArrayList<Patient>();
    private static List<TestSpecification> testSpecifications = new ArrayList<TestSpecification>();
    private static List<TestApplication> testApplications=new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void init(){
        Patient p1=new Patient("Ali","Ahmadi","1122334455","001");
        Patient p2=new Patient("Naghi","mamuli","9988776655","007");
        patients.add(p1);
        patients.add(p2);
        NormalRange nr1=new NormalRange(100,120);
        NormalRange nr2=new NormalRange(130,180);
        TestSpecification ts1=new TestSpecification("BSF","Body Structure Form",nr1);
        TestSpecification ts2=new TestSpecification("HDL","Amount of Good Cholesterol",nr2);
        testSpecifications.add(ts1);
        testSpecifications.add(ts2);

    }

    public static void addPatient(Patient patient) {
        patients.add(patient);

    }

    public static void addTestSpec(TestSpecification testSpecification) {
        testSpecifications.add(testSpecification);

    }

    public static void addTestApp(TestApplication testApplication){
        testApplications.add(testApplication);

    }

    public static String getName() {

        Boolean retrieved = false;
        String pattern = "(\\s*)([a-zA-Z]*)(\\s*)([a-zA-Z]*)(\\s*)";
        String value = "";
        try {

            while (!retrieved) {
                System.out.println("Please Enter an non seperate String: ");
                value = sc.nextLine();
                if (value.matches(pattern)) retrieved = true;

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return value;
    }

    public static String getString() {

        Boolean retrieved = false;
        String value = "";
        try {
           System.out.println("Please Enter an description String: ");
           value = sc.nextLine();
        }
         catch (Exception ex) {
            ex.printStackTrace();
        }
        return value;
    }

    public static String getChoice() {

        Boolean retrieved = false;
        String pattern = "(\\d)";
        String value = "";
        try {

            while (!retrieved) {
                System.out.println("Please Enter A Single Digit: ");
                value = sc.nextLine();
                if (value.matches(pattern)) retrieved = true;

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return value;
    }

    public static String getNumber() {

        Boolean retrieved = false;
        String pattern = "(\\d+)";
        String value = "";
        try {

            while (!retrieved) {
                System.out.println("Please Enter A Number: ");
                value = sc.nextLine();
                if (value.matches(pattern)) retrieved = true;

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return value;
    }

    public static Patient findPatientByNumber(String num){
        for (Patient p:patients ) {
            if (p.getRegisterationNumber().equals(num))return p;
        }
        return null;
    }

    public static TestSpecification findTestByName(String name){
        for (TestSpecification ts:testSpecifications ) {
            if (ts.getTestName().equals(name))return ts;
        }
        return null;
    }

    public static List<TestApplication> findPatientAllTests(Patient pp){
        List<TestApplication> testApplicationList=new ArrayList<>();
        for (TestApplication ts:testApplications) {
            if(ts.getPatient().equals(pp))testApplicationList.add(ts);
        }
        return testApplicationList;
    }

    public static void closeScanner(){
        sc.close();
    }

    public static void showMenu() {
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||| Welcome to Taheri Medical TestSpecification \" TMT \" Clinic |||||");
        System.out.println("|||                                                   |||");
        System.out.println("|||                                                   |||");
        System.out.println("|||   Please Choose Your Desired Service :            |||");
        System.out.println("|||                                                   |||");
        System.out.println("|||    1. Register Patient                            |||");
        System.out.println("|||    2. Register New Test Specification             |||");
        System.out.println("|||    3. Register New Test Application               |||");
        System.out.println("|||    4. Show Test Results                           |||");
        System.out.println("|||    5. Exit                                        |||");
        System.out.println("|||                                                   |||");
        System.out.println("|||                                                   |||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }

}
