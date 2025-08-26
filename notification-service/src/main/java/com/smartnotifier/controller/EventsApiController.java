package com.smartnotifier.controller;

import org.springframework.http.HttpStatus;

import com.smartnotifier.api.EventsApi;
import com.smartnotifier.model.EventRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.common.lang.Nullable;

@RestController
public class EventsApiController implements EventsApi{
    @Override
    public ResponseEntity<Void> eventsPost(EventRequest eventRequest,@Nullable Boolean dryRun){
        System.out.println("Received Event: "+ eventRequest.getEventType() + " for user: "+ eventRequest.getUserId());

        if(Boolean.TRUE.equals(dryRun)){
            System.out.println("Dry Run - event validated,not queued");
        }else{
            System.out.println("Real run - queueing event.");
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}