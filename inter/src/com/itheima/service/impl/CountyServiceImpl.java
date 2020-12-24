package com.itheima.service.impl;

import com.itheima.dao.CountyDao;

import com.itheima.po.County;

import com.itheima.service.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CountyServiceImpl implements CountyService {

    @Autowired
    private CountyDao countyDao;
    @Override
    public List<County> findCounty(int id) {
        return this.countyDao.findCounty(id);
    }
}
