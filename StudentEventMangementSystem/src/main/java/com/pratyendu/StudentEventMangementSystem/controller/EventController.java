package com.pratyendu.StudentEventMangementSystem.controller;

import com.pratyendu.StudentEventMangementSystem.model.Event;
import com.pratyendu.StudentEventMangementSystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/event")
public class EventController {
    @Autowired
    EventService service;

    @PostMapping("add")
    public String addEvent(@RequestBody Event event){// ✅
        return service.addEvent(event);
    }

    @PutMapping("update/name/{name}")
    public String UpdateEvent(@RequestBody Event event, @PathVariable String name){
        return service.UpdateEvent(event, name);
    }

    @DeleteMapping("delete/name/{name}")
    public String deleteEvent(@PathVariable String name){//
        return service.deleteEvent(name);
    }

    @GetMapping("get")// ✅
    public List<Event> getAll(){
        return service.getAll();
    }

    @GetMapping("get/date/{date}")
    public List<Event> getBydate(@PathVariable String date){
        return service.getBydate(date);
    }
}

//    Add event
//    Update event
//    Delete event
//    Get All event by date