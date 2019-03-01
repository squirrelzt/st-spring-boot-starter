package com.starter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 类名称: StarterApplicationMain
 * 类描述: spring-boot启动方式:spring-boot-dependencies
 * @author squirrel
 * @date 2019-03-01
 */
@SpringBootApplication
public class StarterApplicationMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(StarterApplicationMain.class).run(args);
    }
}
