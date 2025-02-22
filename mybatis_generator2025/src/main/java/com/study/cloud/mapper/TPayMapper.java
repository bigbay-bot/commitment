package com.study.cloud.mapper;

import com.study.cloud.entity.TPay;

/**
 * @Entity com.study.cloud.entity.TPay
 */
public interface TPayMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TPay record);

    int insertSelective(TPay record);

    TPay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPay record);

    int updateByPrimaryKey(TPay record);

}




