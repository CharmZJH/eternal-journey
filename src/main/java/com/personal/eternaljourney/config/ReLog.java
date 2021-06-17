package com.personal.eternaljourney.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author ZhouJieHao
 * @Date 2021/6/16 8:46
 * @Version 2.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReLog {

    String desc() default "打印报文";
}

