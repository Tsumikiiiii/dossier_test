package com.medical.dossier.controller;

import com.medical.dossier.Dto.PatientDto;
import com.medical.dossier.entity.Patient;
import com.medical.dossier.resultset.CodeMsg;
import com.medical.dossier.resultset.Result;
import com.medical.dossier.service.PatientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PatientController {
    @Resource
    private PatientService patientService;

    @RequestMapping(value="/queryPatient",method = RequestMethod.GET)
    private Result queryPatient(){
        List<Patient> patient=  patientService.queryPatient();
        if(!patient.isEmpty()){
            return Result.success(patient);
        }
        else return Result.error(CodeMsg.fail);
    }
    @RequestMapping(value="/queryPatientById",method = RequestMethod.GET)
    private Result queryPatientById(String patientId){
        Patient patient=patientService.queryPatientById(patientId);
        if(patient!=null){
            return Result.success(patient);
        }
        else return Result.error(CodeMsg.fail);

    }
    @RequestMapping(value="/insertPatient",method = RequestMethod.GET)
    private Result insertPatient(PatientDto patientDto){
        if(patientService.insertPatient(patientDto)){
            return Result.success();
        }
        else return Result.error(CodeMsg.fail);
    }

    @RequestMapping(value="/deletePatient",method = RequestMethod.GET)
    private Result deletePatient(String patientId){
        if(patientService.deletePatient(patientId)){
            return Result.success();
        }
        else return Result.error(CodeMsg.fail);
    }

    @RequestMapping(value="/updatePatient",method = RequestMethod.GET)
    private Result updatePatient(Patient patient){
        if(patientService.updatePatient(patient)){
            return Result.success();
        }
        else return Result.error(CodeMsg.fail);
    }
}
