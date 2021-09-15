package com.medical.dossier.service.impl;

import com.medical.dossier.Dto.PatientDto;
import com.medical.dossier.dao.PatientDao;
import com.medical.dossier.entity.Patient;
import com.medical.dossier.service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {
    @Resource
    private PatientDao patientDao;
    @Override
    public List<Patient> queryPatient() {
        return patientDao.queryPatient();
    }

    @Override
    public Patient queryPatientById(String patientId) {
        return patientDao.queryPatientById(patientId);
    }

    @Override
    public boolean insertPatient(PatientDto patientDto) {
        int effect=patientDao.insertPatient(patientDto);
        if(effect==1){
            return true;
        }
        else return false;

    }

    @Override
    public boolean deletePatient(String patientId) {
        int effect=patientDao.deletePatient(patientId);
        if(effect==1){
            return true;
        }
        else return false;
    }

    @Override
    public boolean updatePatient(Patient patient) {
        int effect=patientDao.updatePatient(patient);
        if(effect==1){
            return true;
        }
        else return false;
    }
}
