package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.CityDao;
import com.example.po.City;
import com.example.service.CityService;

@Service
@Transactional
public class CityServiceImpl implements CityService{
	@Autowired
    private CityDao cityDao;
    @Override

    public City findCity(Integer id) {
        return this.cityDao.findCity(id);
    }
}

