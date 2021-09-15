package com.medical.dossier.dao;

import com.medical.dossier.Dto.DossierListDto;
import com.medical.dossier.entity.DossierList;
import com.medical.dossier.entity.DossierListt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DossierListDao {

    /**
     * 查询全部病历
     * @return 返回病历列表
     */
    List<DossierList> queryDossier();

    /**
     * 通过医生id查找病历
     * @param doctorId 医生id
     * @return 满足要求的病历列表
     */
    List<DossierList>queryDossierByDoctorId(String doctorId);

    /**
     * 通过病人id查找病历
     * @param patientId 病人id
     * @return 满足要求的病历列表
     */
    List<DossierList>queryDossierByPatientId(String patientId);

    /**
     * 增加病历
     * @param
     * @return 1=成功增加
     */
    int insertDossier(DossierList dossierList);

    /**
     * 通过医生id和病人id一起删除
     * @param dossierListDto 包括病人和医生id
     * @return
     */
    int deleteDossier(DossierListDto dossierListDto);

    /**
     * 修改病历
     * @param dossierList
     * @return
     */
    int updateDossier(DossierList dossierList);


    int insertD(DossierListt dossierListt);

    int updateD(DossierListt dossierListt);
}
