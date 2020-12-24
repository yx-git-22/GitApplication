package com.itheima.service.impl;

import com.itheima.dao.ProvinceDao;
import com.itheima.po.Province;
import com.itheima.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceDao provinceDao;
    @Override
    public List<Province> findProvince() {
        return this.provinceDao.findProvince();
    }
}
