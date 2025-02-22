package com.study.cloud.controller;

import com.study.cloud.entity.TPay;
import com.study.cloud.entity.TPayDTO;
import com.study.cloud.resp.ResultData;
import com.study.cloud.resp.ReturnCodeEnum;
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
    public ResultData<String> addPay(@RequestBody TPay pay) {
        System.out.println(pay.toString());
        int i = payService.add(pay);
        return ResultData.success("成功插入记录，返回值：" + i);
    }

    @DeleteMapping(value = "/pay/del/{id}")
    public ResultData<Integer> deletePay(@PathVariable("id") Integer id) {
        return ResultData.success(payService.delete(id));
    }

    @PutMapping(value = "/pay/update")
    public ResultData<String> updatePay(@RequestBody TPayDTO payDTO) {
        TPay pay = new TPay();
        BeanUtils.copyProperties(payDTO, pay);

        int i = payService.update(pay);
        return ResultData.success("成功修改记录，返回值：" + i);
    }

    @GetMapping(value = "/pay/get/{id}")
    public ResultData<TPay> getById(@PathVariable("id") Integer id) {
        return ResultData.success(payService.getById(id));
    }

    //全部查询getall作为家庭作业
    @GetMapping(value = "/pay/getall")
    public ResultData<List<TPay>> getAll(){
        return ResultData.success(payService.getAll());
    }

    @RequestMapping(value = "/pay/error",method = RequestMethod.GET)
    public ResultData<Integer> getPayError()
    {
        int data = 10/0;
        return ResultData.success(data);
    }

}
