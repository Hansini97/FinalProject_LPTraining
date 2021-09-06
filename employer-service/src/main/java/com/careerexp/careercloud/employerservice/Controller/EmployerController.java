package com.careerexp.careercloud.employerservice.Controller;



import com.careerexp.careercloud.commons.model.employer.Employer;
import com.careerexp.careercloud.employerservice.Service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employerservices")
public class EmployerController {

    @Autowired
    EmployerService employerService;

    @RequestMapping(value = "/employers",method = RequestMethod.POST)
    public Employer save(@RequestBody Employer employer){

        return employerService.save(employer);

    }

    @RequestMapping(value = "/employers",method = RequestMethod.GET)
    public List<Employer> findAllEmployers(){

        return employerService.findAll();

    }

    @GetMapping(value = "/employers/{id}")
    public Employer getEmployer(@PathVariable int id) {

        return employerService.findById(id);
    }


    @RequestMapping(value = "/employers/{id}",method = RequestMethod.DELETE)
    public String deleteEmployer(@PathVariable("id") Integer id) {
        return employerService.deleteEmployer(id);
    }


    @RequestMapping(value = "/employers/{id}",method = RequestMethod.POST)
    public String updateEmployer(@PathVariable int id, @RequestBody Employer employer) {
        return employerService.updateEmployerById(id,employer);
    }


}
