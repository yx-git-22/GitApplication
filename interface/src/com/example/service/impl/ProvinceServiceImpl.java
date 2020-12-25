package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ProvinceDao;
import com.example.po.Province;
import com.example.service.ProvinceService;

@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService{
	@Autowired
    private ProvinceDao provinceDao;
	@Override
    public Province findProvince() {
        return this.provinceDao.findProvince();
    }
}
