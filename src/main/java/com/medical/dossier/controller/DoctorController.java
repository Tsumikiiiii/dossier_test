package com.medical.dossier.controller;

import com.medical.dossier.Dto.DoctorDto;
import com.medical.dossier.Vo.DoctorVo;
import com.medical.dossier.dao.DoctorDao;
import com.medical.dossier.entity.Doctor;
import com.medical.dossier.resultset.CodeMsg;
import com.medical.dossier.resultset.Result;
import com.medical.dossier.service.impl.DoctorServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DoctorController {
    @Resource
    private DoctorServiceImpl doctorService;
    @Resource
    private DoctorDao doctorDao;

    @RequestMapping(value="/slogin",method = RequestMethod.GET)
    private Result login(String doctorId,String password){
        DoctorDto doctorDto=new DoctorDto();
        doctorDto.setDoctorId(doctorId);
        doctorDto.setPassword(password);
        if(doctorService.login(doctorDto)){
            DoctorVo doctorVo=doctorDao.showInformation(doctorDto.getDoctorId());
            return Result.success(doctorVo);
        }
        else return Result.error(CodeMsg.NOT_FIND_DATA);
    }

    @RequestMapping(value="/updateDoctor",method = RequestMethod.GET)
    private Result updateDoctor(Doctor doctor){
        if(doctorService.updateDoctor(doctor)){
            return Result.success();
        }
        else return Result.error(CodeMsg.UPDATE_ERROR);
    }
}
