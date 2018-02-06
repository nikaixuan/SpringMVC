package com.nikaixuan.spring.basics.springinfivesteps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by nikaixuan on 6/2/18.
 */
@Component
public class SomeExternalServices {
    @Value("${external.service.url}")
    private String url;
    public String returnStringUrl(){
        return this.url;
    }
}
