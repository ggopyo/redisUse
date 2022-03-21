package com.clamos.redis;

import com.clamos.redis.model.WeatherItem;
import com.clamos.redis.repo.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringRedisApplication{

    @Autowired
    WeatherRepository WeatherRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringRedisApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        WeatherItem weather = new WeatherItem(
//                "Eng2015001", "John Doe", "2","2","2","2","2","2","2","2");
//        WeatherRepository.save(weather);
//        WeatherItem retrievedWeather =
//                WeatherRepository.findById("Eng2015001").get();
//        System.out.println(retrievedWeather);

}
