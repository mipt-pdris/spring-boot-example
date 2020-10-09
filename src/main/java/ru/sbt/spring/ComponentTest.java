package ru.sbt.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ComponentTest {
    @Autowired
    @Qualifier("url")
    String url;
    @Autowired
    @Qualifier("token")
    String token;

    @Autowired
    public ComponentTest() {
        this.url = "url";
        this.token = "ken";
    }

    @Autowired
    public void setUrl(@Qualifier("url") String url) {
        this.url = url;
    }
}
