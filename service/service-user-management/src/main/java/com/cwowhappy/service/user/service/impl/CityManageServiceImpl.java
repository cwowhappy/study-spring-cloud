package com.cwowhappy.service.user.service.impl;

import com.cwowhappy.service.user.dao.CityMapper;
import com.cwowhappy.service.user.domain.City;
import com.cwowhappy.service.user.service.CityManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManageServiceImpl implements CityManageService {
    private CityMapper cityMapper;

    @Override
    public List<City> listAllCities() {
        return cityMapper.listAllCities();
    }

    @Override
    public void addCity(City city) {

    }

    @Autowired
    public void setCityMapper(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }
}
