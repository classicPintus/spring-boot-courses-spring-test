package com.wideside.test.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DummyJob {
    
    private final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
    @Scheduled(cron = "${job.dummy.cron}")
    public void doSomething(){
        logger.info(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }
    
}
