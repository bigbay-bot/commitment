package com.study.cloud.service;

import com.study.cloud.entity.TPay;

import java.util.List;

/**
 * @Author fanweihua
 * @Date 2025/2/22 19:45
 * @Description
 */
public interface PayService {
    public int add(TPay pay);

    public int delete(Integer id);

    public int update(TPay pay);

    public TPay getById(Integer id);

    public List<TPay> getAll();
}
