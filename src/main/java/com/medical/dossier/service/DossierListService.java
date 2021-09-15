package com.medical.dossier.service;

import com.medical.dossier.Dto.DossierListDto;
import com.medical.dossier.entity.DossierList;
import com.medical.dossier.entity.DossierListt;

import java.util.List;

public interface DossierListService {

    List<DossierList> queryDossier();

    List<DossierList>queryDossierByDoctorId(String doctorId);

    List<DossierList>queryDossierByPatientId(String patientId);

    boolean insertDossier(DossierListt dossierList);

    boolean deleteDossier(DossierListDto dossierListDto);


    boolean updateDossier(DossierListt dossierList);
}
