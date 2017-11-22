package com.webservice.mtmanapi.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/12.
 */
@ConfigurationProperties(prefix = "app")
@PropertySource("classpath:app.properties")
@Component
@Getter
@Setter
public class AppConfiguation {
    private int serverPort;
    private String dllFilePath;
}
