package com.medical.dossier.service.impl;

import com.medical.dossier.Dto.DossierListDto;
import com.medical.dossier.dao.DossierListDao;
import com.medical.dossier.entity.DossierList;
import com.medical.dossier.entity.DossierListt;
import com.medical.dossier.service.DossierListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DossierListServiceImpl implements DossierListService {
    @Resource
    private DossierListDao dossierListDao;

    @Override
    public List<DossierList> queryDossier() {
        return dossierListDao.queryDossier();
    }

    @Override
    public List<DossierList> queryDossierByDoctorId(String doctorId) {
        return dossierListDao.queryDossierByDoctorId(doctorId);
    }

    @Override
    public List<DossierList> queryDossierByPatientId(String patientId) {
        return dossierListDao.queryDossierByPatientId(patientId);
    }

    @Override
    public boolean insertDossier(DossierListt dossierList) {
        int effect=dossierListDao.insertD(dossierList);
        if(effect==1){
            return true;
        }
        else return false;
    }

    @Override
    public boolean deleteDossier(DossierListDto dossierListDto) {
        int effect=dossierListDao.deleteDossier(dossierListDto);
        if(effect==1){
            return true;
        }
        else return false;
    }

    @Override
    public boolean updateDossier(DossierListt dossierList) {
        int effect=dossierListDao.updateD(dossierList);
        if(effect==1){
            return true;
        }
        else return false;
    }
}
