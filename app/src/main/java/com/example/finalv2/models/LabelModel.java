package com.example.finalv2.models;

public class LabelModel {
    String label ;
    String description;

    public String getLabel() {
        return label;
    }

    public LabelModel() {
    }

    public LabelModel(String label, String description) {
        this.label = label;
        this.description = description;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
