package com.example.application.services;

import com.example.application.client.PredictionResponse;
import com.example.application.data.entity.SchoolSubjects;
import com.example.application.data.entity.IntermediateSubjects;
import com.example.application.data.entity.DegreeSubjects;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PredictionService {

    private static final Map<String, List<String>> COLLEGE_SUGGESTIONS = new HashMap<>();

    static {
        COLLEGE_SUGGESTIONS.put("Engineering", Arrays.asList("IIT Delhi", "IIT Bombay", "NIT Trichy"));
        COLLEGE_SUGGESTIONS.put("Medical", Arrays.asList("AIIMS Delhi", "CMC Vellore", "Kasturba Medical College"));
        COLLEGE_SUGGESTIONS.put("Commerce", Arrays.asList("SRCC", "Loyola College", "Christ University"));
        // Add more streams and colleges here
    }

    public PredictionResponse predictSchool(SchoolSubjects features) {
        String prediction = "Science"; // Example logic
        return createResponse(prediction);
    }

    public PredictionResponse predictIntermediate(IntermediateSubjects features) {
        String prediction = "Engineering"; // Example logic
        return createResponse(prediction);
    }

    public PredictionResponse predictCareer(DegreeSubjects features) {
        String prediction = "Software Developer"; // Example logic
        return createResponse(prediction);
    }

    private PredictionResponse createResponse(String prediction) {
        PredictionResponse response = new PredictionResponse();
        response.setPrediction(prediction);
        response.setSuggestions(COLLEGE_SUGGESTIONS.getOrDefault(prediction, Arrays.asList("No suggestions available")));
        return response;
    }
}
