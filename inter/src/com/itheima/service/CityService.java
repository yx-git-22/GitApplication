package com.itheima.service;

import com.itheima.po.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    public List<City> findCity(int id);
}
