package com.medical.dossier.dao;

import com.medical.dossier.Dto.PatientDto;
import com.medical.dossier.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PatientDao {
    /**
     * 查询病人信息--返回全部病人信息
     * @return 全部病人(list)
     */
    List<Patient> queryPatient();

    /**
     * 通过病人id查找病人信息
     * @param patientId
     * @return
     */
    Patient queryPatientById(String patientId);

    /**
     * 增加病人
     * @param patientDto 不包括id因为id是自增主键
     * @return 成功返回1
     */
    int insertPatient(PatientDto patientDto);

    /**
     * 通过病人id删除病人
     * @param patientId
     * @return
     */
    int deletePatient(String patientId);

    /**
     * 更新病人信息
     * @param patient 用id来做条件修改
     * @return
     */
    int updatePatient(Patient patient);
}
