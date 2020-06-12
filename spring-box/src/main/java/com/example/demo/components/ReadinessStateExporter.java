package com.example.demo.components;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.AvailabilityState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import static org.springframework.boot.availability.ReadinessState.ACCEPTING_TRAFFIC;
import static org.springframework.boot.availability.ReadinessState.REFUSING_TRAFFIC;

@Component
public class ReadinessStateExporter {

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<AvailabilityState> event) {
        System.out.println("AvailabilityChangeEvent:{event}:" + event.getState());
        AvailabilityState state = event.getState();
        if (ACCEPTING_TRAFFIC.equals(state)) {// create file /tmp/healthy
        } else if (REFUSING_TRAFFIC.equals(state)) {// remove file /tmp/healthy
        }
    }

}