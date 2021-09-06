package com.careerexp.careercloud.interviewservice.controller;

import com.careerexp.careercloud.commons.model.interview.Interview;
import com.careerexp.careercloud.interviewservice.model.Response;
import com.careerexp.careercloud.interviewservice.model.SimpleResponse;
import com.careerexp.careercloud.interviewservice.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/interviewservices")
public class InterviewController {
    @Autowired
    InterviewService interviewService;


    @RequestMapping(value = "/interviews",method = RequestMethod.POST)
    public Interview save(@RequestBody Interview interview){
        return interviewService.save(interview);
    }


    @RequestMapping(value = "/interviews",method = RequestMethod.GET)
    public List<Interview> findAllInterview() {
        return interviewService.findAll();
    }


    @GetMapping(value = "/interviews/interviews/{id}")
    public Interview getInterviewsbyID(@PathVariable int id) {

        return interviewService.findById(id);
    }


    @GetMapping(value = "interviews/{id}")
    public Response getInterview(@PathVariable int id, @RequestParam(required = false) String type) {

        if(type==null){
            return new SimpleResponse(interviewService.findById(id));
        }else{
            return  interviewService.findDetailResponse(id);
        }
    }


    @RequestMapping(value = "/interviews/{id}",method = RequestMethod.DELETE)
    public String deleteInterview(@PathVariable("id") Integer id) {
        return interviewService.deleteInterview(id);
    }

}
