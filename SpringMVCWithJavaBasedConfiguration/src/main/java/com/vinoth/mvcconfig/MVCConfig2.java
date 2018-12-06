package com.vinoth.mvcconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@ComponentScan("com.vinoth.controller")
@EnableWebMvc
@Configuration
public class MVCConfig2
{

}
