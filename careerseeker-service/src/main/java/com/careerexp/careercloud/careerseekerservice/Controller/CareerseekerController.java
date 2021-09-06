package com.careerexp.careercloud.careerseekerservice.Controller;

import com.careerexp.careercloud.careerseekerservice.Service.CareerseekerService;
import com.careerexp.careercloud.commons.model.careerseeker.Careerseeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/careerseekerservices")
public class CareerseekerController {

    @Autowired
    CareerseekerService careerseekerService;

    @RequestMapping(value = "/careerseekers",method = RequestMethod.POST)
    public Careerseeker save(@RequestBody Careerseeker careerseeker){

        return careerseekerService.save(careerseeker);

    }

    @RequestMapping(value = "/careerseekers",method = RequestMethod.GET)
    public List<Careerseeker> findAllCareerseeker(){

        return careerseekerService.findAll();

    }

    @GetMapping(value = "/careerseekers/{id}")
    public Careerseeker getCareerseeker(@PathVariable int id) {

        return careerseekerService.findById(id);
    }


    @RequestMapping(value = "/careerseekers/{id}",method = RequestMethod.POST)
    public String updateCareerseeker(@PathVariable int id, @RequestBody Careerseeker careerseeker) {
        return careerseekerService.updateCareerseekerById(id,careerseeker);
    }

    @RequestMapping(value = "/careerseekers/{id}",method = RequestMethod.DELETE)
    public String deleteCareerseeker(@PathVariable("id") Integer id) {
        return careerseekerService.deleteCareerseeker(id);
    }
}
