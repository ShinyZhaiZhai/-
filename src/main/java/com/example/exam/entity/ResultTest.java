package com.example.exam.entity;

import java.util.Objects;

public class ResultTest {
    private int Eno;
    private int RprofessionalTest;
    private int RinterviewTest;
    private int RcomputerTest;

    public ResultTest(){

    }

    public ResultTest(int eno,int professionalTest,int interviewTest,int computerTest) {
        Eno = eno;
        RprofessionalTest = professionalTest;
        RinterviewTest = interviewTest;
        RcomputerTest = computerTest;
    }

    public int getEno() { return Eno; }

    public void setEno(int eno) { Eno = eno; }

    public int getRprofessionalTest() { return RprofessionalTest; }

    public void setRprofessionalTest(int rprofessionalTest) { RprofessionalTest = rprofessionalTest; }

    public int getRinterviewTest() { return RinterviewTest; }

    public void setRinterviewTest(int rinterviewTest) { RinterviewTest = rinterviewTest; }

    public int getRcomputerTest() { return RcomputerTest; }

    public void setRcomputerTest(int rcomputerTest) { RcomputerTest = rcomputerTest; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultTest that = (ResultTest) o;
        return getEno() == that.getEno() &&
                getRprofessionalTest() == that.getRprofessionalTest() &&
                getRinterviewTest() == that.getRinterviewTest() &&
                getRcomputerTest() == that.getRcomputerTest();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEno(), getRprofessionalTest(), getRinterviewTest(), getRcomputerTest());
    }

    @Override
    public String toString() {
        return "ResultTest{" +
                "Eno=" + Eno +
                ", RprofessionalTest=" + RprofessionalTest +
                ", RinterviewTest=" + RinterviewTest +
                ", RcomputerTest=" + RcomputerTest +
                '}';
    }
}
