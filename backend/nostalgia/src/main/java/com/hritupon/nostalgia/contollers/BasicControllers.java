package com.hritupon.nostalgia.contollers;

import com.hritupon.nostalgia.properties.NostalgiaProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hritupon on 23/8/17.
 */
@RestController
@EnableAutoConfiguration
public class BasicControllers {
    @Autowired
    NostalgiaProperties nostalgiaProperties;
    @RequestMapping("/")
    String home(){
        return nostalgiaProperties.getMessage();
    }
}
