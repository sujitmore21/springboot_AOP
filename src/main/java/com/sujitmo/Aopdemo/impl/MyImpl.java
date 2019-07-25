package com.sujitmo.Aopdemo.impl;


import com.sujitmo.Aopdemo.repository.MyInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements MyInterface {

    @Override
    public String checkAop() {
        System.out.println("------Helloooo--------");
        return "Hello AOP";
    }
}
