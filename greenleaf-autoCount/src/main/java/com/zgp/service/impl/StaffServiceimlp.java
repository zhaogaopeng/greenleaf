package com.zgp.service.impl;

import com.zgp.dao.StaffDao;
import com.zgp.entity.Staff;
import com.zgp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 实现类
 *
 * @author zhaogp 2021/6/6 0006
 */
@Service
public class StaffServiceimlp  implements StaffService {

    @Resource
    private StaffDao staffDao;
    @Override
    public Staff getSatffByName(String id) {
        Staff satffByName = staffDao.getSatffByName(id);
        return satffByName;
    }
}
