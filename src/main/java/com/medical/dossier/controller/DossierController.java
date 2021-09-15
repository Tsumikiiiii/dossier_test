package com.medical.dossier.controller;

import com.medical.dossier.Dto.DossierListDto;
import com.medical.dossier.dao.DossierListDao;
import com.medical.dossier.entity.DossierList;
import com.medical.dossier.entity.DossierListt;
import com.medical.dossier.resultset.CodeMsg;
import com.medical.dossier.resultset.Result;
import com.medical.dossier.service.DossierListService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DossierController {
    @Resource
    private DossierListService dossierListService;

    @RequestMapping(value="/queryDossier",method = RequestMethod.GET)
    private Result queryDossier(){
        List<DossierList> dossierList=dossierListService.queryDossier();
        if(!dossierList.isEmpty()){
            return Result.success(dossierList);
        }
        else return Result.error(CodeMsg.fail);
    }

    @RequestMapping(value="/queryDossierByDoctorId",method = RequestMethod.GET)
    private Result queryDossierByDoctorId(String doctorId){
        List<DossierList> dossierList=dossierListService.queryDossierByDoctorId(doctorId);
        if(!dossierList.isEmpty()){
            return Result.success(dossierList);
        }
        else return Result.error(CodeMsg.fail);
    }
    @RequestMapping(value="/queryDossierByPatientId",method = RequestMethod.GET)
    private Result queryDossierByPatientId(String patientId){
        List<DossierList> dossierList=dossierListService.queryDossierByPatientId(patientId);
        if(!dossierList.isEmpty()){
            return Result.success(dossierList);
        }
        else return Result.error(CodeMsg.fail);
    }

    @RequestMapping(value="/insertDossier",method = RequestMethod.GET)
    private Result insertDossier(DossierListt dossierList){
        if(dossierListService.insertDossier(dossierList)){
            return Result.success();

        }
        else return Result.error(CodeMsg.fail);
    }

    @RequestMapping(value="deleteDossier",method =RequestMethod.GET)
    private Result deleteDossier(DossierListDto dossierListDto){
        if(dossierListService.deleteDossier(dossierListDto)){
            return Result.success();
        }
        else return Result.error(CodeMsg.fail);
    }

    @RequestMapping(value="updateDossier",method = RequestMethod.GET)
    private Result updateDossier(DossierListt dossierList ){
        if(dossierListService.updateDossier(dossierList)){
            return Result.success();
        }
        else return Result.error(CodeMsg.fail);
    }
}
