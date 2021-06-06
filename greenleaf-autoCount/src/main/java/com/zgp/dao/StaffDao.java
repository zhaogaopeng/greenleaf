package com.zgp.dao;


import com.zgp.entity.Staff;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffDao {

    Staff getSatffByName(String id);
}
