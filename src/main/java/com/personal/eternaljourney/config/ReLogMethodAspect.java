package com.personal.eternaljourney.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author ZhouJieHao
 * @Date 2021/6/16 8:46
 * @Version 2.0
 */
@Aspect
@Component
public class ReLogMethodAspect extends ReLogAspect{

    // 切入点
    @Pointcut("@annotation(com.personal.eternaljourney.config.ReLog)")
    public void logPointCut() {}

}