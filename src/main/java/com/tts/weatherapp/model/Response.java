package com.tts.weatherapp.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Response {

    private Map<String, String> coord;
    private List<Map<String, String>> weather;
    private String base;
    private Map<String, String> main;
    private Map<String, String> wind;
    private Map<String, String> clouds;
    private String dt;
    private Map<String, String> sys;
    private String id;
    private String name;
    private String cod;


    public Map<String, String> getCoord() {
        return coord;
    }

    public void setCoord(Map<String, String> coord) {
        this.coord = coord;
    }

    public List<Map<String, String>> getWeather() {
        return weather;
    }

    public void setWeather(List<Map<String, String>> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, String> getMain() {
        return main;
    }

    public void setMain(Map<String, String> main) {
        this.main = main;
    }

    public Map<String, String> getWind() {
        return wind;
    }

    public void setWind(Map<String, String> wind) {
        this.wind = wind;
    }

    public Map<String, String> getClouds() {
        return clouds;
    }

    public void setClouds(Map<String, String> clouds) {
        this.clouds = clouds;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Map<String, String> getSys() {
        return sys;
    }

    public void setSys(Map<String, String> sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Response(Map<String, String> coord, List<Map<String, String>> weather, String base, Map<String, String> main, Map<String, String> wind, Map<String, String> clouds, String dt, Map<String, String> sys, String name, String cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.name = name;
        this.cod = cod;
    }

    public Response(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return coord.equals(response.coord) &&
                weather.equals(response.weather) &&
                base.equals(response.base) &&
                main.equals(response.main) &&
                wind.equals(response.wind) &&
                clouds.equals(response.clouds) &&
                dt.equals(response.dt) &&
                sys.equals(response.sys) &&
                id.equals(response.id) &&
                name.equals(response.name) &&
                cod.equals(response.cod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coord, weather, base, main, wind, clouds, dt, sys, id, name, cod);
    }
}