package com.example.transporter.backend.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.transporter.backend.model.Transporter;
import com.example.transporter.backend.services.TransporterService;

@RestController
public class TransporterController {

    @Autowired
    TransporterService transporterService;

    public TransporterController(TransporterService transporterService){
        this.transporterService = transporterService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/transporters")
    public ArrayList<Transporter> getTransporters(){

        return transporterService.getAndSaveAllResponses();     
        //return Arrays.asList(londonTransportData);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/get-all")
    public ArrayList<Transporter> getAll(){
        return (ArrayList<Transporter>) transporterService.findAllTransporters();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("get-all/delete/{identityId}")
    public Boolean delete(@PathVariable(value= "identityId") Long identityId){
        transporterService.delete(identityId);
        return true;
    }


}
