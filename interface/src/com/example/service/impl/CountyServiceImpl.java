package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.CountyDao;
import com.example.po.County;
import com.example.service.CountyService;

@Service
@Transactional
public class CountyServiceImpl implements CountyService{
	@Autowired
    private CountyDao countyDao;
    @Override
    public County findCounty(Integer id) {
        return this.countyDao.findCounty(id);
    }
}
