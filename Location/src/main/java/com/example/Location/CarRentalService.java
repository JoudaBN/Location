package com.example.Location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class CarRentalService {
    @Autowired
    private  VehiculeRepository vehiculeRepository;

    public CarRentalService(VehiculeRepository vehiculeRepository){
       this.vehiculeRepository=vehiculeRepository;
    }

    private List<Vehicule> vehicules = new ArrayList<Vehicule>();


    @GetMapping("/vehicules")
    public List<Vehicule> getListOfCars(){
        return vehicules;
    }

    @PostMapping("/vehicules")
    public void addVehicule(@RequestBody Vehicule vehicule) throws Exception{

        vehicules.add(vehicule);
    }

    @GetMapping("/vehicules/{plateNumber}")
    public Vehicule getVehicule(@PathVariable(value = "plateNumber") String plateNumber){
        for(Vehicule vehicule: vehicules){
            if(vehicule.getPlateNumber().equals(plateNumber)){
                return vehicule;
            }
        }
        return null;
    }

    @RequestMapping(value = "/vehicules/{plateNumber}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void getBack(
            @PathVariable("plateNumber") String plateNumber) throws Exception{
    }

    @RequestMapping(value = "/vehicules/{plateNumber}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void rent(
            @PathVariable("plateNumber") String plateNumber)
            throws Exception{
    }
    @RequestMapping(value = "/vehicules/{plateNumber}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void rentAndGetBack(@PathVariable("plateNumber") String plateNumber, @RequestParam(value="rent", required = true)boolean rent)

            throws Exception{
    }

    @RequestMapping(value = "/vehicules/{plateNumber}", method = RequestMethod.PUT)
    public void rent(@PathVariable("plateNumber") String plateNumber, @RequestParam(value="rent",
            required = true)boolean rent, @RequestBody Date dates){
    }
}