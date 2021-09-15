package com.medical.dossier.service;

import com.medical.dossier.Dto.DoctorDto;
import com.medical.dossier.entity.Doctor;

public interface DoctorService {
    /**
     * 医生登录密码检查
     * @param doctorDto
     * @return true or false
     */
    boolean login(DoctorDto doctorDto);

    /**
     * 更新医生信息
     * @param doctor
     * @return true of false
     */
    boolean updateDoctor(Doctor doctor);
}
