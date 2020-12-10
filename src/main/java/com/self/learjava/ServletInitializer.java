package com.self.learjava;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/*
 * SpringBoot的jsp项目这个是必须写的,没有就无法启动,这个类的类名随意,但是必须继承SpringBootServletInitializer这个类
 */
public class ServletInitializer extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//传入SpringBoot应用的主程序
		return builder.sources(App.class);
	}
}
