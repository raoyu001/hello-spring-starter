package com.github.raoyu001.hello;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author raoyu
 * @since  2019/5/17 14:52
 */
@Configuration
@ConditionalOnWebApplication
@Import(value = {HelloService.class,HelloProperties.class})
//让spring扫描到HelloProperties,不用这个的话，在目标属性类上加上@Configuration或@Component也一样，但要在@Import上加下
//@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {
}
