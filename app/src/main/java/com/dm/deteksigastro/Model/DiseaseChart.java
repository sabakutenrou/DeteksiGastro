package com.dm.deteksigastro.Model;

import java.util.ArrayList;

public class DiseaseChart extends SymptomsChart {
    private ArrayList<Integer> subBagan;
    private double percentage;

    public DiseaseChart() {
        this(null);
    }

    public DiseaseChart(String name) {
        this(name, null);
    }

    public DiseaseChart(String name, String question) {
        super(name, question);

        subBagan = new ArrayList<>();
    }

    public ArrayList<Integer> getSubBagan() {
        return subBagan;
    }

    public void setSubBagan(ArrayList<Integer> subBagan) {
        this.subBagan = subBagan;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}