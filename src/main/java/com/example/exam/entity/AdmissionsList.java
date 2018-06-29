package com.example.exam.entity;

import java.util.Objects;

public class AdmissionsList {
    private int Eno;
    private String Amatriculation;
    private int ApreliminaryTest;
    private int AresultTest;

    public AdmissionsList(){

    }

    public AdmissionsList(int eno, String amatriculation, int apreliminaryTest, int aresultTest) {
        Eno = eno;
        Amatriculation = amatriculation;
        ApreliminaryTest = apreliminaryTest;
        AresultTest = aresultTest;
    }

    public int getEno() { return Eno; }

    public void setEno(int eno) { Eno = eno; }

    public String getAmatriculation() { return Amatriculation; }

    public void setAmatriculation(String amatriculation) { Amatriculation = amatriculation; }

    public int getApreliminaryTest() { return ApreliminaryTest; }

    public void setApreliminaryTest(int apreliminaryTest) { ApreliminaryTest = apreliminaryTest; }

    public int getAresultTest() { return AresultTest; }

    public void setAresultTest(int aresultTest) { AresultTest = aresultTest; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdmissionsList that = (AdmissionsList) o;
        return getEno() == that.getEno() &&
                getApreliminaryTest() == that.getApreliminaryTest() &&
                getAresultTest() == that.getAresultTest() &&
                Objects.equals(getAmatriculation(), that.getAmatriculation());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEno(), getAmatriculation(), getApreliminaryTest(), getAresultTest());
    }

    @Override
    public String toString() {
        return "AdmissionsList{" +
                "Eno=" + Eno +
                ", Amatriculation='" + Amatriculation + '\'' +
                ", ApreliminaryTest=" + ApreliminaryTest +
                ", AresultTest=" + AresultTest +
                '}';
    }
}
