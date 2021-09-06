package com.careerexp.careercloud.interviewservice.service;

import com.careerexp.careercloud.commons.model.careerseeker.Careerseeker;
import com.careerexp.careercloud.commons.model.employer.Employer;
import com.careerexp.careercloud.commons.model.interview.Interview;
import com.careerexp.careercloud.interviewservice.model.InterviewDetailResponse;
import com.careerexp.careercloud.interviewservice.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class InterviewServiceImpl implements InterviewService{

    @Autowired
    InterviewRepository interviewRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Interview save(Interview interview) {
        return interviewRepository.save(interview);
    }

    @Override
    public List<Interview> findAll() {
        return interviewRepository.findAll();
    }

    @Override
    public InterviewDetailResponse findDetailResponse(int id) {
        Interview interview=findById(id);
        Employer employer=getEmployer(interview.getEmployerId());
        Careerseeker careerseeker= getCareerseeker(interview.getCareerseekerId());

        return new InterviewDetailResponse(interview,employer,careerseeker);

    }
    @Override
    public Interview findById(int id) {
        Optional<Interview> interview = interviewRepository.findById(id);

        if (interview.isPresent())
            return interview.get();
        else
            return new Interview();

    }
    private Employer getEmployer(int employerId){

        Employer employer=restTemplate.getForObject("http://localhost:9191/employerservices/employers/"+employerId,Employer.class);
        return employer;

    }

    private Careerseeker getCareerseeker(int careerseekerId){

        return restTemplate.getForObject("http://localhost:9192/careerseekerservices/careerseekers/"+careerseekerId,Careerseeker.class);


    }

    @Override
    public String deleteInterview(Integer id) {
        interviewRepository.delete(findById(id));
        return "The record deleted successfully!";
    }




}