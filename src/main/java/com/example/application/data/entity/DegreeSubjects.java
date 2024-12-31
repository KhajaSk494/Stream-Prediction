package com.example.application.data.entity;

public class DegreeSubjects {
    private Integer cs;
    private Integer it;
    private Integer ec;

    // Getters and Setters
    public Integer getCs() {
        return cs;
    }

    public void setCs(Integer cs) {
        this.cs = cs;
    }

    public Integer getIt() {
        return it;
    }

    public void setIt(Integer it) {
        this.it = it;
    }

    public Integer getEc() {
        return ec;
    }

    public void setEc(Integer ec) {
        this.ec = ec;
    }

    @Override
    public String toString() {
        return "DegreeSubjects [cs=" + cs + ", it=" + it + ", ec=" + ec + "]";
    }
}
