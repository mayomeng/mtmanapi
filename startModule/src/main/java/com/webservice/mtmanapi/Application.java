package com.webservice.mtmanapi;

import com.webservice.mtmanapi.configuration.AppConfiguation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2017/9/12.
 */
@SpringBootApplication
@Slf4j
public class Application implements EmbeddedServletContainerCustomizer {

    @Autowired
    private AppConfiguation appConfiguation;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(appConfiguation.getServerPort());
    }
}