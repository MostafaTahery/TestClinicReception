package com.company.src;

import com.company.src.tst.NormalRange;
import com.company.src.tst.TestApplication;
import com.company.src.tst.TestSpecification;

public class Main {

    private static String choice = "";

    public static void main(String[] args) {
        Utils.init();
        while (!choice.equals("5")) {
            Utils.showMenu();
            choice = Utils.getChoice();
            switch (choice) {
                case "1": {
                    Patient p1 = new Patient();
                    System.out.println("Please Enter Patient's First Name: ");
                    p1.setFirstName(Utils.getName());
                    System.out.println("Please Enter Patient's Last Name: ");
                    p1.setLastName(Utils.getName());
                    System.out.println("Please Enter Patient's Social Security Number: ");
                    p1.setSsn(Utils.getNumber());
                    System.out.println("Please Enter Patient's Registration Number: ");
                    p1.setRegisterationNumber(Utils.getNumber());
                    Utils.addPatient(p1);
                }
                case "2": {
                    TestSpecification t1 = new TestSpecification();
                    NormalRange nr=new NormalRange();
                    System.out.println("Please Enter the name of the Test: ");
                    t1.setTestName(Utils.getName());
                    System.out.println("Please Enter the Description of the Test: ");
                    t1.setDescription(Utils.getString());
                    System.out.println("Please Enter the Upper Bound for Normal Range of the Test: ");
                    nr.setUpperBound(Integer.getInteger(Utils.getNumber()));
                    System.out.println("Please Enter the lower Bound for Normal Range of the Test: ");
                    nr.setLowerBound(Integer.getInteger(Utils.getNumber()));
                    t1.setNormalRange(nr);
                    Utils.addTestSpec(t1);
                    break;
                }
                case "3":{
                    TestApplication ta=new TestApplication();
                    String regNum;
                    String testName;
                    System.out.println("Please Enter the Registration Number of Patient: ");
                    regNum=Utils.getNumber();
                    System.out.println("Please Enter the Name for The Examined Test: ");
                    testName=Utils.getName();
                    Patient pp;
                    try {
                        pp = Utils.findPatientByNumber(regNum);
                    }
                    catch (NullPointerException nex){
                        System.out.println("No Such Patient Found!!! Please Try Again! ");
                        nex.printStackTrace();
                        break;
                    }
                    System.out.println("please Enter Result for The Examined Test: ");
                    Integer result=Integer.getInteger(Utils.getNumber());
                    ta.setPatient(pp);
                    TestSpecification ts=Utils.findTestByName(testName);
                    ta.setTestSpecification(ts);
                    ta.setPatient(pp);
                    ta.setResult(result);
                    Utils.addTestApp(ta);
                    break;
                }
                case "4":{
                    System.out.println("Please Enter Patient's Registration Number: ");
                    String regNum=Utils.getNumber();
                    try {
                        Patient pp = Utils.findPatientByNumber(regNum);
                        System.out.println(pp);

                        System.out.println( Utils.findPatientAllTests(pp));
                    }
                    catch (NullPointerException nex){
                        System.out.println("No Such Patient Found!!! Please Try Again! ");
                        nex.printStackTrace();
                        break;
                    }
                    break;

                }
                case "5":Utils.closeScanner();
            }

        }
    }
}
