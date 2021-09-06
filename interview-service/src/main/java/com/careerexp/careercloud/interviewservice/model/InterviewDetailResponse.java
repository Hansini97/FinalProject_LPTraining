package com.careerexp.careercloud.interviewservice.model;

import com.careerexp.careercloud.commons.model.careerseeker.Careerseeker;
import com.careerexp.careercloud.commons.model.employer.Employer;
import com.careerexp.careercloud.commons.model.interview.Interview;

public class InterviewDetailResponse implements Response{

        Interview interview;
        Employer employer;
        Careerseeker careerseeker;

    public InterviewDetailResponse(Interview interview, Employer employer, Careerseeker careerseeker) {
            this.interview= interview;
            this.employer = employer;
            this.careerseeker = careerseeker;
        }

    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Careerseeker getCareerseeker() {
        return careerseeker;
    }

    public void setCareerseeker(Careerseeker careerseeker) {
        this.careerseeker = careerseeker;
    }
}
