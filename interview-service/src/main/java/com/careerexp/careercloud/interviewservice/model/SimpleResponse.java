package com.careerexp.careercloud.interviewservice.model;

import com.careerexp.careercloud.commons.model.interview.Interview;
public class SimpleResponse implements Response{

    Interview interview;

    public SimpleResponse(Interview interview) {
        this.interview = interview;
    }

    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
    }
}
