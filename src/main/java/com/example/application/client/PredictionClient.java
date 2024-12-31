package com.example.application.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.application.data.entity.SchoolSubjects;
import com.example.application.data.entity.IntermediateSubjects;
import com.example.application.data.entity.DegreeSubjects;

@FeignClient(name = "prediction-client", url = "http://localhost:8080")
public interface PredictionClient {

    @PostMapping("/api/predict-school")
    PredictionResponse predictSchool(@RequestBody SchoolSubjects schoolSubjects);

    @PostMapping("/api/predict-intermediate")
    PredictionResponse predictIntermediate(@RequestBody IntermediateSubjects intermediateSubjects);

    @PostMapping("/api/predict-career")
    PredictionResponse predictCareer(@RequestBody DegreeSubjects degreeSubjects);
}
