package com.careerexp.careercloud.commons.model.interview;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "interview")
public class Interview implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int interviewId;
    int employerId;
    int careerseekerId;
    LocalDateTime interviewOn;
    String employerType;

    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public int getCareerseekerId() {
        return careerseekerId;
    }

    public void setCareerseekerId(int careerseekerId) {
        this.careerseekerId = careerseekerId;
    }

    public LocalDateTime getInterviewOn() {
        return interviewOn;
    }

    public void setInterviewOn(LocalDateTime interviewOn) {
        this.interviewOn = interviewOn;
    }

    public String getEmployerType() {
        return employerType;
    }

    public void setEmployerType(String employerType) {
        this.employerType = employerType;
    }
}