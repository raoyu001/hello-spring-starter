package com.github.raoyu001.hello;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author raoyu
 * @since  2019/5/17 14:50
 */
@Service
public class HelloService {

    @Resource
    private HelloProperties helloProperties;

    /**
     * 打招呼方法
     * @param name 人名，向谁打招呼使用
     * @return
     */
    public String sayHello(String name) {
        return new StringBuilder("hello ").append(name)
                .append(" ")
                .append(helloProperties.getMessage()).toString();
    }
}
