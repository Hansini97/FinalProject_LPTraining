package com.careerexp.careercloud.careersuggestionservice.Service;

import com.careerexp.careercloud.commons.model.careersuggestion.CareerSuggestion;

import java.util.List;

public interface CareersuggestionService {

    CareerSuggestion findByExperienceyears(int experienceyears);
    CareerSuggestion save(CareerSuggestion careersuggestion);

    List<CareerSuggestion> findAll();
}
