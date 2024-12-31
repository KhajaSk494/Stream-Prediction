package com.example.application.client;

import java.util.List;

public class PredictionResponse {
    private String prediction;
    private List<String> suggestions;

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }

    @Override
    public String toString() {
        return "PredictionResponse [prediction=" + prediction + ", suggestions=" + suggestions + "]";
    }
}
