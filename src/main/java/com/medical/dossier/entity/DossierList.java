package com.medical.dossier.entity;

public class DossierList {
    private String doctorId;
    private String patientId;
    private String symptom;
    private String treatment;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorID) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
