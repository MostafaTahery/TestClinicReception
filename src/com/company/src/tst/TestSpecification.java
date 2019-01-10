package com.company.src.tst;

import com.company.src.tst.NormalRange;

public class TestSpecification {

    private String testName;
    private String description;
    private NormalRange normalRange;

    public TestSpecification() {
    }

    public TestSpecification(String testName, String description, NormalRange normalRange) {
        this.testName = testName;
        this.description = description;
        this.normalRange = normalRange;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NormalRange getNormalRange() {
        return normalRange;
    }

    public void setNormalRange(NormalRange normalRange) {
        this.normalRange = normalRange;
    }

    @Override
    public String toString() {
        return "TestSpecification{" +
                "testName='" + testName + '\'' +
                ", normalRange=" + normalRange +
                "}";
    }
}
