package com.github.raoyu001.hello;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author raoyu
 * @since  2019/5/17 14:50
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private String message = "world!";
}
