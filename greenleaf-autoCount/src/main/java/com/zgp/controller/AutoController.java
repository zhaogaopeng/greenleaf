package com.zgp.controller;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.zgp.entity.Staff;
import com.zgp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自动统计
 *
 * @author zhaogp 2021/6/6 0006
 */
@RestController
@RequestMapping("/api/count")
public class AutoController {

    @Autowired
    private StaffService staffService;


    @RequestMapping("/test")
    public String ok(String id){
        String i = String.valueOf(RandomUtil.randomInt());
        Staff satffByName = staffService.getSatffByName(id);

        return satffByName.toString();
    }

}

























