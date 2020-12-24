package com.itheima.dao;

import com.itheima.po.City;
import com.itheima.po.County;

import java.util.List;

public interface CountyDao {
    public List<County> findCounty(int id);
}

