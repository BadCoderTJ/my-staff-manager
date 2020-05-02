package com.tj.mystaffmanager.service;

import com.tj.mystaffmanager.entity.StaffEntity;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.service
 * @NAME: StaffService
 * @USER: GOD_T
 * @DATE: 2020/5/1
 * @TIME: 21:48
 **/
public interface StaffService {
    List<StaffEntity> getAllStaff();
}
