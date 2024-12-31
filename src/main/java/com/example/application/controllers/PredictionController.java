package com.example.application.controllers;

import com.example.application.client.PredictionResponse;
import com.example.application.data.entity.SchoolSubjects;
import com.example.application.data.entity.IntermediateSubjects;
import com.example.application.data.entity.DegreeSubjects;
import com.example.application.services.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @PostMapping("/predict-school")
    public PredictionResponse predictSchool(@RequestBody SchoolSubjects features) {
        return predictionService.predictSchool(features);
    }

    @PostMapping("/predict-intermediate")
    public PredictionResponse predictIntermediate(@RequestBody IntermediateSubjects features) {
        return predictionService.predictIntermediate(features);
    }

    @PostMapping("/predict-career")
    public PredictionResponse predictCareer(@RequestBody DegreeSubjects features) {
        return predictionService.predictCareer(features);
    }
}
