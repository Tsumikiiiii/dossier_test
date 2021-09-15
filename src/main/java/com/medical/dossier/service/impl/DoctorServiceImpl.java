package com.medical.dossier.service.impl;

import com.medical.dossier.Dto.DoctorDto;
import com.medical.dossier.Vo.DoctorVo;
import com.medical.dossier.dao.DoctorDao;
import com.medical.dossier.entity.Doctor;
import com.medical.dossier.service.DoctorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Resource
    private DoctorDao doctorDao;


    @Override
    public boolean login(DoctorDto doctorDto) {
        if (doctorDto== null) {
            throw new NullPointerException("userVo is null");
        }
        DoctorDto doctorDto1=doctorDao.checkLogin(doctorDto.getDoctorId(),doctorDto.getPassword());

        if(doctorDto1!=null){
            return true;
        }
        else return false;

    }

    @Override
    public boolean updateDoctor(Doctor doctor) {
        int effect=doctorDao.updateInformation(doctor);
        if(effect==1)
            return true;
        else return false;
    }
}
