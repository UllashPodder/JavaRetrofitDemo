package com.example.javaretrofitdemo.DataModel;

public class ResponseModel {
    String fact;
    Integer length;

    public ResponseModel()  {

    }
    public ResponseModel(String fact, int length) {
        this.fact = fact;
        this.length = length;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}
