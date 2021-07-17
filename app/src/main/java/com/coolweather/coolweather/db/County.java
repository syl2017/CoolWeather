package com.coolweather.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author syl
 * @time 2021/3/16 21:45
 * @detail
 */
class County extends DataSupport {
    private int id;
    private String countryName;//记录县的名字
    private String weatherId;//记录县所对应的天气id
    private int cityId;//记录当前县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
