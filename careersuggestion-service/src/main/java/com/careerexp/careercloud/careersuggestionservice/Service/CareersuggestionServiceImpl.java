package com.careerexp.careercloud.careersuggestionservice.Service;

import com.careerexp.careercloud.careersuggestionservice.Repository.CareersuggestionRepository;
import com.careerexp.careercloud.commons.model.careersuggestion.CareerSuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CareersuggestionServiceImpl implements CareersuggestionService{

    @Autowired
    CareersuggestionRepository careersuggestionRepository;

    @Override
    public CareerSuggestion save(CareerSuggestion careersuggestion) {
        return careersuggestionRepository.save(careersuggestion);
    }

    @Override
    public List<CareerSuggestion> findAll() {
        return careersuggestionRepository.findAll();
    }

    @Override
    public CareerSuggestion findByExperienceyears(int experienceyears) {
        Optional<CareerSuggestion> careersuggestion = careersuggestionRepository.findByExperienceyears(experienceyears);
        return careersuggestion.get();

    }
}