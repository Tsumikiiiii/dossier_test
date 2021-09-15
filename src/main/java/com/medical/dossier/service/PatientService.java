package com.medical.dossier.service;

import com.medical.dossier.Dto.PatientDto;
import com.medical.dossier.entity.Patient;

import java.util.List;

public interface PatientService {
    /**
     * 返回全部病人信息
     * @return list
     */
   List<Patient> queryPatient();

    /**
     * 通过id查找病人
     * @param patientId
     * @return
     */
   Patient queryPatientById(String patientId);

    /**
     * 增加病人
     * @param patientDto patient实体不包括id
     * @return true or false
     */
   boolean insertPatient(PatientDto patientDto);

    /**
     * 通过id删除病人信息
     * @param patientId
     * @return
     */
   boolean deletePatient(String patientId);

    /**
     * 通过病人id更改病人信息
     * @param patient
     * @return
     */
   boolean updatePatient(Patient patient);


}
