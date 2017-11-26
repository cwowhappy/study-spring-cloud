package com.cwowhappy.service.user.service;

import com.cwowhappy.service.user.domain.City;

import java.util.List;

public interface CityManageService {
    List<City> listAllCities();

    void addCity(City city);
}
