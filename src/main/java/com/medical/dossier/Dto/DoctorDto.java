package com.medical.dossier.Dto;

public class DoctorDto {
    private String doctorId;
    private String password;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorID) {
        this.doctorId = doctorID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
