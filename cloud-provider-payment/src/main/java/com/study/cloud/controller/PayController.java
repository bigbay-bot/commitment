package com.study.cloud.controller;

import com.study.cloud.entity.TPay;
import com.study.cloud.entity.TPayDTO;
import com.study.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author fanweihua
 * @Date 2025/2/22 19:47
 * @Description
 */
@RestController
public class PayController {
    @Resource
    PayService payService;

    @PostMapping(value = "/pay/add")
    public String addPay(@RequestBody TPay pay) {
        System.out.println(pay.toString());
        int i = payService.add(pay);
        return "成功插入记录，返回值：" + i;
    }

    @DeleteMapping(value = "/pay/del/{id}")
    public Integer deletePay(@PathVariable("id") Integer id) {
        return payService.delete(id);
    }

    @PutMapping(value = "/pay/update")
    public String updatePay(@RequestBody TPayDTO payDTO) {
        TPay pay = new TPay();
        BeanUtils.copyProperties(payDTO, pay);

        int i = payService.update(pay);
        return "成功修改记录，返回值：" + i;
    }

    @GetMapping(value = "/pay/get/{id}")
    public TPay getById(@PathVariable("id") Integer id) {
        return payService.getById(id);
    }

    //全部查询getall作为家庭作业
    @GetMapping(value = "/pay/getall")
    public List<TPay> getAll(){
        return payService.getAll();
    }

}
