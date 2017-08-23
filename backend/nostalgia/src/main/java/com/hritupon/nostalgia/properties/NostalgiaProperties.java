package com.hritupon.nostalgia.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by hritupon on 23/8/17.
 */
//@EnableConfigurationProperties
@ConfigurationProperties()
@Component
@PropertySource(value={"classpath:nostalgia.yml"})
public class NostalgiaProperties {
    @Getter @Setter
    @Value("$ {message}")
    private String message;


}
