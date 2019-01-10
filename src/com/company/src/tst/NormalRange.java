package com.company.src.tst;

public class NormalRange {
    private Integer upperBound;
    private Integer lowerBound;

    public NormalRange() {}

    public NormalRange( Integer lowerBound,Integer upperBound) {
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
    }

    public Integer getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(Integer upperBound) {
        this.upperBound = upperBound;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    @Override
    public String toString() {
        return "NormalRange = | " + upperBound +" - "+ lowerBound+" |";
    }
}
