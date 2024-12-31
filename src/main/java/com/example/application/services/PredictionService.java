package com.example.application.services;

import com.example.application.client.PredictionResponse;
import com.example.application.data.entity.SchoolSubjects;
import com.example.application.data.entity.IntermediateSubjects;
import com.example.application.data.entity.DegreeSubjects;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredictionService {

    public PredictionResponse predictSchool(SchoolSubjects schoolSubjects) {
        // Example logic
        PredictionResponse response = new PredictionResponse();
        response.setPrediction("Science");
        response.setSuggestions(List.of("IIT Delhi", "NIT Trichy", "IIT Bombay"));
        return response;
    }

    public PredictionResponse predictIntermediate(IntermediateSubjects intermediateSubjects) {
        // Example logic
        PredictionResponse response = new PredictionResponse();
        response.setPrediction("Engineering");
        response.setSuggestions(List.of("NIT Warangal", "BITS Pilani", "VIT Vellore"));
        return response;
    }

    public PredictionResponse predictCareer(DegreeSubjects degreeSubjects) {
        // Example logic
        PredictionResponse response = new PredictionResponse();
        response.setPrediction("Software Development");
        response.setSuggestions(List.of("Google", "Microsoft", "Amazon"));
        return response;
    }
}
