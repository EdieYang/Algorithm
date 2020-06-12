package com.example.demo.components;

import org.springframework.beans.BeansException;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


public class BeforeApplicationContextCreatedListener implements ApplicationListener {


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("--------- execute MyApplicationStartingEventListener----------"+applicationEvent.toString());
    }
}
