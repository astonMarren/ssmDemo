package com.jshx.selfTest.aop;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(EnjoyBeanDefinitionRegistart.class)
public @interface ZLScan {
}
