package com.tts.weatherapp.service;



import com.tts.weatherapp.model.Response;
import com.tts.weatherapp.repository.ZipCodeRepository;
import com.tts.weatherapp.model.ZipCode;
import com.tts.weatherapp.repository.RequestRepository;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
//import java.util.Optional;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    @Autowired
    RequestRepository requestRepository;

    @Autowired
    ZipCodeRepository zipCodeRepository;

    public List<ZipCode> getRecentSearches(){
        return zipCodeRepository.findAll();
    }



    public Response getForecast(String zipCode){

        ZipCode zip = new ZipCode(zipCode);

        // code to check if zip is already in database
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" +
                zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();

        try {
            if (zipCodeRepository.findByZip(zipCode) == null){
                zipCodeRepository.save(zip);
            }
//            System.out.println("Result of findByZip: " + zipCodeRepository.findByZip(zipCode));
            return restTemplate.getForObject(url, Response.class);
        } catch (HttpClientErrorException|ConstraintViolationException ex){
            Response response = new Response();
            response.setName("error");
            return response;
        }

    }


    
}