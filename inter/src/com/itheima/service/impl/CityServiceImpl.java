package com.itheima.service.impl;

import com.itheima.dao.CityDao;
import com.itheima.po.City;
import com.itheima.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override

    public List<City> findCity(int id) {
        return this.cityDao.findCity(id);
    }
}
