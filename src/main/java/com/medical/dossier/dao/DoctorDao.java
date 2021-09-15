package com.medical.dossier.dao;

import com.medical.dossier.Dto.DoctorDto;
import com.medical.dossier.Vo.DoctorVo;
import com.medical.dossier.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DoctorDao {
    /**
     * 用于检查登录账号密码是否对得上
     * @param doctorId 账号
     * @param password 密码
     * @return 返回一个dto看是否为空，不为空则账号密码匹配。
     */
    DoctorDto checkLogin(String doctorId,String password);

    /**
     * 用于登录时返回医生信息
     * @param doctorId 医生账号id
     * @return 包括姓名，年龄，性别，职称，科室，电话
     */
    DoctorVo showInformation(String doctorId);


    /**
     * 修改医生个人信息
     * @param doctor
     * @return
     */
    int updateInformation(Doctor doctor);

}
