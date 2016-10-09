/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {

    @Before("execution(* com.example.jersery..*.*(..))")
    public void logMethodAccessBefore(JoinPoint joinPoint) {
        System.out.println("***** Starting: " + joinPoint.getSignature().getName() + " *****");
    }

    @AfterReturning(value = "execution(* com.example.jersery..*.*(..))")
    public void logMethodAccessAfter(JoinPoint joinPoint) {
        System.out.println("***** Completed: " + joinPoint.getSignature().getName() + " *****");
    }

}
