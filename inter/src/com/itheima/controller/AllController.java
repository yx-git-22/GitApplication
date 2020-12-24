package com.itheima.controller;

import com.itheima.po.City;
import com.itheima.po.County;
import com.itheima.po.Province;
import com.itheima.service.CityService;
import com.itheima.service.CountyService;
import com.itheima.service.ProvinceService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AllController {
	@Autowired
    private ProvinceService provinceService;
    @Autowired
    private CityService cityService;
    @Autowired
    private CountyService countyService;

    @RequestMapping(value ="/China")
    public String findProvince(Model model){
        List<Province> list =provinceService.findProvince();
        for (Province province:list){

            System.out.println(province.toString());
        }
        String jsonArray=JSONArray.fromObject(list).toString();
        model.addAttribute("jsonarray",jsonArray);
        return "/text";

    }
    @RequestMapping(value = "/China/{id}")
    public String findCity(@PathVariable("id")Integer id, Model model){
        List<City> list= cityService.findCity(id);
        for (City city:list){
            System.out.println(city.toString());
        }
        String jsonArray=JSONArray.fromObject(list).toString();
        model.addAttribute("jsonarray",jsonArray);
        return "/text";
    }
    @RequestMapping(value = "/China/{?}/{id}")
    public String findCounty(@PathVariable("id")Integer id, Model model){
        List<County> list= countyService.findCounty(id);
        for (County county:list){
            System.out.println(county.toString());
        }
        String jsonArray=JSONArray.fromObject(list).toString();
        model.addAttribute("jsonarray",jsonArray);
        return "/text";
    }
}
