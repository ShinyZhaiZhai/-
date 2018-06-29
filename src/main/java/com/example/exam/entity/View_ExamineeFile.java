package com.example.exam.entity;

import java.util.Objects;

public class View_ExamineeFile {

    private int Eno;
    private String Ename;
    private boolean Esex;
    private int Eage;
    private String EpoliticalStatus;
    private boolean Ecurrent;
    private String Eeducation;
    private String Esource;
    private String MprofessionalName;
    private String Ecategory;

    public View_ExamineeFile(){

    }

    public View_ExamineeFile(int eno,String ename, boolean esex, int eage, String epoliticalStatus, boolean ecurrent,String eeducation, String esource, String mprofessionalName,String ecategory) {
        Eno = eno;
        Ename = ename;
        Esex = esex;
        Eage = eage;
        EpoliticalStatus = epoliticalStatus;
        Ecurrent = ecurrent;
        Eeducation = eeducation;
        Esource = esource;
        MprofessionalName = mprofessionalName;
        Ecategory = ecategory;
    }

    public int getEno() {
        return Eno;
    }

    public void setEno(int eno) {
        Eno = eno;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public boolean isEsex() {
        return Esex;
    }

    public void setEsex(boolean esex) {
        Esex = esex;
    }

    public int getEage() {
        return Eage;
    }

    public void setEage(int eage) {
        Eage = eage;
    }

    public String getEpoliticalStatus() {
        return EpoliticalStatus;
    }

    public void setEpoliticalStatus(String epoliticalStatus) {
        EpoliticalStatus = epoliticalStatus;
    }

    public boolean isEcurrent() {
        return Ecurrent;
    }

    public void setEcurrent(boolean ecurrent) {
        Ecurrent = ecurrent;
    }
    public String getEeducation() {
        return Eeducation;
    }

    public void setEeducation(String eeducation) {
        Eeducation = eeducation;
    }

    public String getEsource() {
        return Esource;
    }

    public void setEsource(String esource) {
        Esource = esource;
    }

    public String getMprofessionalName() { return MprofessionalName; }

    public void setMprofessionalName(String mprofessionalName) { MprofessionalName = mprofessionalName; }
    public String getEcategory() {
        return Ecategory;
    }

    public void setEcategory(String ecategory) {
        Ecategory = ecategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        View_ExamineeFile that = (View_ExamineeFile) o;
        return getEno() == that.getEno() &&
                isEsex() == that.isEsex() &&
                getEage() == that.getEage() &&
                isEcurrent() == that.isEcurrent() &&
                Objects.equals(getEname(), that.getEname()) &&
                Objects.equals(getEpoliticalStatus(), that.getEpoliticalStatus()) &&
                Objects.equals(getEeducation(), that.getEeducation()) &&
                Objects.equals(getEsource(), that.getEsource()) &&
                Objects.equals(getMprofessionalName(), that.getMprofessionalName()) &&
                Objects.equals(getEcategory(), that.getEcategory());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEno(), getEname(), isEsex(), getEage(), getEpoliticalStatus(), isEcurrent(), getEeducation(), getEsource(), getMprofessionalName(), getEcategory());
    }

    @Override
    public String toString() {
        return "View_ExamineeFile{" +
                "Eno=" + Eno +
                ", Ename='" + Ename + '\'' +
                ", Esex=" + Esex +
                ", Eage=" + Eage +
                ", EpoliticalStatus='" + EpoliticalStatus + '\'' +
                ", Ecurrent=" + Ecurrent +
                ", Eeducation='" + Eeducation + '\'' +
                ", Esource='" + Esource + '\'' +
                ", MprofessionalName='" + MprofessionalName + '\'' +
                ", Ecategory='" + Ecategory + '\'' +
                '}';
    }
}
