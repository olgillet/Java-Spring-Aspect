package com.springaspect.music;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.springaspect.music")
@EnableAspectJAutoProxy
public class AppConfig {
}