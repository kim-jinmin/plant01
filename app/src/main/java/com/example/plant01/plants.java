package com.example.plant01;

public class plants {
    String PlantName, PlantImg;

    public plants(){};

    public plants(String plantName, String plantImg) {
        PlantName = plantName;
        PlantImg = plantImg;
    }



    public String getPlantName() {
        return PlantName;
    }

    public void setPlantName(String plantName) {
        PlantName = plantName;
    }

    public String getPlantImg() {
        return PlantImg;
    }

    public void setPlantImg(String plantImg) {
        PlantImg = plantImg;
    }
}
