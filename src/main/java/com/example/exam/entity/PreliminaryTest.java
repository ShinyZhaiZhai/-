package com.example.exam.entity;

import java.util.Objects;

public class PreliminaryTest {
    private int Eno;
    private int PpoliticalTest;
    private int PforeignTest;
    private int PprofessionalTest;

    public PreliminaryTest() {
    }

    public PreliminaryTest(int eno, int politicalTest, int foreignTest, int professionalTest) {
        Eno = eno;
        PpoliticalTest = politicalTest;
        PforeignTest = foreignTest;
        PprofessionalTest = professionalTest;
    }

    public int getEno() { return Eno;}

    public void setEno(int eno) { Eno = eno; }

    public int getPforeignTest() { return PforeignTest; }

    public void setPforeignTest(int pforeignTest) { PforeignTest = pforeignTest; }

    public int getPpoliticalTest() { return PpoliticalTest; }

    public void setPpoliticalTest(int ppoliticalTest) { PpoliticalTest = ppoliticalTest; }

    public int getPprofessionalTest() { return PprofessionalTest; }

    public void setPprofessionalTest(int pprofessionalTest) { PprofessionalTest = pprofessionalTest; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreliminaryTest that = (PreliminaryTest) o;
        return getEno() == that.getEno() &&
                getPpoliticalTest() == that.getPpoliticalTest() &&
                getPforeignTest() == that.getPforeignTest() &&
                getPprofessionalTest() == that.getPprofessionalTest();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEno(), getPpoliticalTest(), getPforeignTest(), getPprofessionalTest());
    }

    @Override
    public String toString() {
        return "PreliminaryTest{" +
                "Eno=" + Eno +
                ", PpoliticalTest=" + PpoliticalTest +
                ", PforeignTest=" + PforeignTest +
                ", PprofessionalTest=" + PprofessionalTest +
                '}';
    }
}

