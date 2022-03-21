package com.clamos.redis.model;

import java.io.Serializable;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Weather")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WeatherItem implements Serializable {

    @Id
    private String name;
    private String baseDate;
    private String baseTime;
    private String temperature; // 기온
    private String hourPrecipitation; // 1시간 강수량
    private String eastWestWind; //동서바람성분
    private String southNorthWind;  //남북바람성분
    private String humidity;  //습도
    private String precipitationForm;  //강수형태
    private String windDirection; //풍향
    private String windSpeed; //풍속


}