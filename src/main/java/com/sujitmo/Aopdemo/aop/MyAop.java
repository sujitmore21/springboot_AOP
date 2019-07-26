package com.sujitmo.Aopdemo.aop;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {


   // @Before("execution(* com.sujitmo.Aopdemo.impl.MyImpl.checkAop())")
   // @After("execution(* com.sujitmo.Aopdemo.impl.MyImpl.checkAop())")
    //@Around("execution(* com.sujitmo.Aopdemo.impl.MyImpl.checkAop())")
    @AfterReturning("execution(* com.sujitmo.Aopdemo.impl.MyImpl.checkAop())")

    public void checkingAOP(){
        System.out.println("--------hi-------");
    }

}
