package com.itheima.dao;

import com.itheima.po.City;

import java.util.List;

public interface CityDao {
    public List<City> findCity(int id);
}
