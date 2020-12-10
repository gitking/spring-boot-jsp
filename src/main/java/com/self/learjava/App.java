package com.self.learjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * SpringBoot开发JSP应用
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {//SpringBoot的JSP项目是没有办法启动在这里直接启动的,必须先启动Servlet容器,比如tomcat,本项目需要打包成war包
        SpringApplication.run(App.class, args);
    }
}
