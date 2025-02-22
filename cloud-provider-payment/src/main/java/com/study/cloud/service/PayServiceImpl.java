package com.study.cloud.service;

import com.study.cloud.entity.TPay;
import com.study.cloud.mapper.TPayMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author fanweihua
 * @Date 2025/2/22 19:46
 * @Description
 */
@Service
public class PayServiceImpl implements PayService{
    @Resource
    TPayMapper payMapper;
    @Override
    public int add(TPay pay){
        return payMapper.insertSelective(pay);
    }
    @Override
    public int delete(Integer id){
        return payMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int update(TPay pay){
        return payMapper.updateByPrimaryKeySelective(pay);
    }
    @Override
    public TPay getById(Integer id){
        return payMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<TPay> getAll(){
        return payMapper.selectAll();
    }
}
