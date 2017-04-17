package com.coolweather.app.model;

/**
 * Created by Administrator on 2017/4/13.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int prvinceId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setPrvinceId(int prvinceId) {
        this.prvinceId = prvinceId;
    }

    public int getPrvinceId() {
        return prvinceId;
    }
}
