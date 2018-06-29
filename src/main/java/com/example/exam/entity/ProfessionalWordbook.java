package com.example.exam.entity;

import java.util.Objects;

public class ProfessionalWordbook {
    private String Mcode;
    private int PinsideEnrolStudents;
    private int PoutsideEnrolStudents;

    public ProfessionalWordbook(){

    }

    public ProfessionalWordbook(String mcode, int pinsideEnrolStudents, int poutsideEnrolStudents) {
        Mcode = mcode;
        PinsideEnrolStudents = pinsideEnrolStudents;
        PoutsideEnrolStudents = poutsideEnrolStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessionalWordbook that = (ProfessionalWordbook) o;
        return PinsideEnrolStudents == that.PinsideEnrolStudents &&
                PoutsideEnrolStudents == that.PoutsideEnrolStudents &&
                Objects.equals(Mcode, that.Mcode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Mcode, PinsideEnrolStudents, PoutsideEnrolStudents);
    }

    @Override
    public String toString() {
        return "ProfessionalWordbook{" +
                "Mcode='" + Mcode + '\'' +
                ", PinsideEnrolStudents=" + PinsideEnrolStudents +
                ", PoutsideEnrolStudents=" + PoutsideEnrolStudents +
                '}';
    }
}
