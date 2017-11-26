package com.cwowhappy.service.user.dao;

import com.cwowhappy.service.user.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {
    @Select("SELECT * FROM city")
    List<City> listAllCitiesInAnnotation();

    List<City> listAllCities();
}
