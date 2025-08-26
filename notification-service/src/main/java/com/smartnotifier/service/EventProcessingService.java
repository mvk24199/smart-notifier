package com.smartnotifier.service;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.stereotype.Service;

import com.smartnotifier.model.EventRequest;
import java.util.Queue;


@Service
public class EventProcessingService {
    private final Queue<EventRequest> eventQueue = new ConcurrentLinkedQueue<>();
    public void processEvent(EventRequest request,Boolean dryRun){
        if(dryRun){
            System.out.println("DryRun: Validating event: "+ request.getEventType());
            return;
        }
        System.out.println("Queueing Event: "+ request.getEventType());
        eventQueue.offer(request);
    }
    public Queue<EventRequest> getEventQueue(){
        return eventQueue;
    }
}
