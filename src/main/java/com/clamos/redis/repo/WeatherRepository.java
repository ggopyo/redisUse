package com.clamos.redis.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clamos.redis.model.WeatherItem;

import java.util.List;

@Repository
public interface WeatherRepository extends CrudRepository<WeatherItem, String> {


}
