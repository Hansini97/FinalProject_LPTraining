package com.careerexp.careercloud.careerseekerservice.Service;

import com.careerexp.careercloud.commons.model.careerseeker.Careerseeker;

import java.util.List;

public interface CareerseekerService {

    Careerseeker save(Careerseeker careerseeker);

    List<Careerseeker> findAll();

    String deleteCareerseeker(Integer id);

    Careerseeker findById(int id);

    String updateCareerseekerById(int id, Careerseeker careerseeker);

}







