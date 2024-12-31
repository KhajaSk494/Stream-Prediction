package com.example.application.data.entity;

public class SchoolSubjects {
    private Integer maths;
    private Integer science;
    private Integer social;

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }

    public Integer getSocial() {
        return social;
    }

    public void setSocial(Integer social) {
        this.social = social;
    }

    @Override
    public String toString() {
        return "SchoolSubjects [maths=" + maths + ", science=" + science + ", social=" + social + "]";
    }
}
