package com.personal.eternaljourney.config;

import com.alibaba.fastjson.JSON;
import com.personal.eternaljourney.utils.Tools;
import io.swagger.annotations.ApiOperation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @Author ZhouJieHao
 * @Date 2021/6/16 8:46
 * @Version 2.0
 */
public class ReLogAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

            String uuid = Tools.createID();
//            logger.info("请求URL : " + request.getRequestURL().toString());
            logger.info("{} ==> HTTP_METHOD: {}", uuid, request.getMethod());
            startTime.set(System.currentTimeMillis());

            MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
            Method targetMethod = methodSignature.getMethod();

            if (targetMethod.isAnnotationPresent(ApiOperation.class)) {

                ApiOperation annotation = targetMethod.getAnnotation(ApiOperation.class);
                logger.info("ApiOperation: {}", annotation.value());
            }

            if (pjp.getArgs().length > 0) {
                try {

                    String requestJson = JSON.toJSONString(pjp.getArgs());
                    logger.info("{} ==>【{}】请求的报文: {}", uuid, targetMethod.getName(), requestJson);

                } catch (Exception e) {

                    logger.error("{} ==>【{}】存在无法解析的报文", uuid);
                }
            }

            //继续执行被切入的方法
            Object proceed = pjp.proceed();
            logger.info("{} ==>【{}】返回的报文: {}", uuid, targetMethod.getName(), JSON.toJSONString(proceed));
            //计算接口执行时间
            long costTime = System.currentTimeMillis() - startTime.get();
            logger.info("{} ==> 耗费时间: {}ms", uuid, costTime);

            return proceed;

        } catch (Throwable e) {

            e.printStackTrace();
            throw e;
        }

    }
}
