package com.tj.mystaffmanager.service;

import com.tj.mystaffmanager.entity.ApplicationEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.service
 * @NAME: ApplicationService
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:34
 **/
public interface ApplicationService {
    void newLeaveAddUndone(ApplicationEntity entity);
    List<ApplicationEntity> getAllUndone();
    void deleteSelectedById(Integer applicateId);
}
