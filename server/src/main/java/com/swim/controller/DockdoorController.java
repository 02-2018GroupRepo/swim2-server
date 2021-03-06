package com.swim.controller;

import com.swim.service.DockdoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value ={"https://swimwarehousemanagement.site", "http://localhost:3000"})
public class DockdoorController {

    @Autowired
    DockdoorService dockdoorService;


    @RequestMapping("/dockdoor/get")
    public List<Integer> getDockdoor() {
        return dockdoorService.getDockdoor();
    }


    @PostMapping("/api/create/dockdoor/{id}")
    public void createDockdoor(@PathVariable Integer id){
            dockdoorService.createDockdoor(id);
    }

    @PostMapping("/api/delete/dockdoor/{id}")
    public void deleteDockdoor(@PathVariable Integer id){
            dockdoorService.deleteDockDoor(id);
    }





    
}
