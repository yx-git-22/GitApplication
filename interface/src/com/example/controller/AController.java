package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.City;
import com.example.po.County;
import com.example.po.Province;
import com.example.service.CityService;
import com.example.service.CountyService;
import com.example.service.ProvinceService;

@Controller
public class AController {
	@Autowired
    private ProvinceService provinceService;
    @Autowired
    private CityService cityService;
    @Autowired
    private CountyService countyService;
    
    @RequestMapping(value ="/china")
    public String findProvince(Model model) {
    	Province province = provinceService.findProvince();
    	model.addAttribute("province", province);
    	return "/text";
    }
    @RequestMapping(value = "/china/{id}")
    public String findCity(@PathVariable("id")Integer id, Model model) {
    	City city = cityService.findCity(id);
    	model.addAttribute("city",city);
    	return "/text1";
    }
    @RequestMapping(value = "/China/{?}/{id}")
    public String findCounty(@PathVariable("id")Integer id, Model model) {
    	County county = countyService.findCounty(id);
    	model.addAttribute("county", county);
    	return "/text2";
    }
}
