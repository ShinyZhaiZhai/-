package com.example.exam.entity;

import java.util.Objects;

public class MajorCatalogue {
    private String Mcode;
    private String MprofessionalName;

    public MajorCatalogue(){

    }

    public MajorCatalogue(String mcode, String mprofessionalName) {
        Mcode = mcode;
        MprofessionalName = mprofessionalName;
    }

    public String getMcode() { return Mcode; }

    public void setMcode(String mcode) { Mcode = mcode; }

    public String getMprofessionalName() { return MprofessionalName; }

    public void setMprofessionalName(String mprofessionalName) { MprofessionalName = mprofessionalName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MajorCatalogue that = (MajorCatalogue) o;
        return Objects.equals(getMcode(), that.getMcode()) &&
                Objects.equals(getMprofessionalName(), that.getMprofessionalName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getMcode(), getMprofessionalName());
    }

    @Override
    public String toString() {
        return "MajorCatalogue{" +
                "Mcode='" + Mcode + '\'' +
                ", MprofessionalName='" + MprofessionalName + '\'' +
                '}';
    }
}
