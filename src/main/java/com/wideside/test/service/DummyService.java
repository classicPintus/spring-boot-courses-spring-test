package com.wideside.test.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DummyService {

    private final RestTemplate restTemplate;

    public DummyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String testMockServer(){
        return restTemplate.getForObject("http://www.google.it", String.class);
    }
}
