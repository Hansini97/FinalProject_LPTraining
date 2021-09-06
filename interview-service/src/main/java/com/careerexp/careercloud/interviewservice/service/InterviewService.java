package com.careerexp.careercloud.interviewservice.service;

import com.careerexp.careercloud.commons.model.interview.Interview;
import com.careerexp.careercloud.interviewservice.model.InterviewDetailResponse;

import java.util.List;

public interface InterviewService {

    Interview save(Interview interview);

    List<Interview> findAll();

    Interview findById(int id);

    InterviewDetailResponse findDetailResponse(int id);

    String deleteInterview(Integer id);

}

