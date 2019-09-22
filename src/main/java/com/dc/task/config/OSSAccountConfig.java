package com.dc.task.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: D&C
 * @Descirption:
 * @Time: 2019-09-21
 */
@Data
@Component
@ConfigurationProperties("oss")
public class OSSAccountConfig {

    private String bucketName;
    private String accessKeyId;
    private String accessKeySecret;
    private String endpoint;
}
