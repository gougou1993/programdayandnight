package com.nivelle.rpc.dubbo.service.other;

import org.springframework.stereotype.Service;

/**
 * @author nivell
 * @date 2019/08/25
 */
@Service
public class ConcreteService {

    public void sayHello() {
        System.err.println("ConcreteService say hello!");
    }
}
