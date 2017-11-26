package com.cwowhappy.service.user.controller;

import com.cwowhappy.service.user.domain.City;
import com.cwowhappy.service.user.respbody.RootRespBody;
import com.cwowhappy.service.user.service.CityManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityManageController {
    private CityManageService cityManageService;

    @RequestMapping("/cities")
    public RootRespBody<List<City>> listAllCities() {
        return RootRespBody.build(RootRespBody.Status.SUCCESS, "SUCCESS", cityManageService.listAllCities());
    }

    @Autowired
    public void setCityManageService(CityManageService cityManageService) {
        this.cityManageService = cityManageService;
    }
}
