package com.wideside.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@RestController
public class DummyRestController {
    private final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @GetMapping(path = "/gianni", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getGianni() {
        return "java";
    }

    @GetMapping(path = "/testFranco", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testFranco() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.isDebugEnabled();

        return "sa sa. Prova ";
    }

    @GetMapping(path = "/testCompleteClass", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CompleteClass testCompleteClass() {
        CompleteClass res = new CompleteClass();

        res.setInstant(Instant.now());
        res.setLocalDate(LocalDate.now());
        res.setLocalDateTime(LocalDateTime.now());
        res.setNumber(new BigDecimal("991.12345"));
        res.setString("Alfa Romeo @#ยง");
        res.setZonedDateTime(ZonedDateTime.now());

        return res;
    }

}
