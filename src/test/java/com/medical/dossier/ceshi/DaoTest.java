package com.medical.dossier.ceshi;
import com.medical.dossier.Dto.DoctorDto;
import com.medical.dossier.dao.DoctorDao;
import com.medical.dossier.dao.DossierListDao;
import com.medical.dossier.dao.PatientDao;
import com.medical.dossier.entity.DossierList;
import com.medical.dossier.entity.DossierListt;
import com.medical.dossier.entity.Patient;
import com.medical.dossier.service.DoctorService;
import com.medical.dossier.service.DossierListService;
import com.medical.dossier.service.PatientService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {
    @Resource
    private DoctorDao doctorDao;

    @Resource
    private DoctorService doctorService;

    @Resource
    private PatientDao patientDao;

    @Resource
    private PatientService patientService;

    @Resource
    private DossierListDao dossierListDao;

    @Resource
    private DossierListService dossierListService;


    @Test
    @Ignore
    public void login(){
        DoctorDto doctorDto=doctorDao.checkLogin("123","123");

        if(doctorService.login(doctorDto)){
            System.out.println("OK");
        }
        else System.out.println("NO");
    }

    @Test
    @Ignore
    public void show(){
        System.out.println(doctorDao.showInformation("123"));
    }



    @Test
    @Ignore
    public  void insertD(){
        DossierListt dossierList=new DossierListt();
        dossierList.setDoctorId("233");dossierList.setPatientId("6");
        dossierList.setSymptom("不行");dossierList.setTreatment("真不行");
        dossierListDao.insertD(dossierList);
    }

    @Test
    public void updateD(){
        DossierListt dossierList=new DossierListt();
        dossierList.setDoctorId("123");dossierList.setPatientId("2");
        dossierList.setSymptom("gggg");dossierList.setTreatment("gggg");
        dossierListDao.updateD(dossierList);
    }
}
