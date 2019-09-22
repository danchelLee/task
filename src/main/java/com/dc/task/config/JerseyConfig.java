package com.dc.task.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * @Auther: D&C
 * @Descirption:
 * @Time: 2019-09-21
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        //注册包的方式
        packages("com.dc.task.web");
    }
}
