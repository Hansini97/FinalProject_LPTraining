package com.careerexp.careercloud.interviewservice.repository;

import com.careerexp.careercloud.commons.model.interview.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview,Integer> {
}