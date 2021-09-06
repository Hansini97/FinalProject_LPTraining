package com.careerexp.careercloud.careersuggestionservice.Controller;

import com.careerexp.careercloud.careersuggestionservice.Service.CareersuggestionService;
import com.careerexp.careercloud.commons.model.careersuggestion.CareerSuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/careersuggestionservices")
public class CareersuggestionController {

    @Autowired
    CareersuggestionService careersuggestionService;

    @RequestMapping(value = "/suggestion",method = RequestMethod.POST)
    public CareerSuggestion save(@RequestBody CareerSuggestion careersuggestion){
        return careersuggestionService.save(careersuggestion);
    }

    @RequestMapping(value = "/suggestion",method = RequestMethod.GET)
    public List<CareerSuggestion> findAllCareersuggestion() {

        return careersuggestionService.findAll();
    }

    @GetMapping(value = "/suggestion/{experienceyears}")
    public CareerSuggestion getSuggestion(@PathVariable int experienceyears) {
        return careersuggestionService.findByExperienceyears(experienceyears);
    }
}
