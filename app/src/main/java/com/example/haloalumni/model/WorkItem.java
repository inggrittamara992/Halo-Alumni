package com.example.haloalumni.model;

public class WorkItem {

    int image;
    private String position, office, address, minSallary, maxSallary;

    public WorkItem(int image, String position, String office, String address, String minSallary, String maxSallary) {
        this.image = image;
        this.position = position;
        this.office = office;
        this.address = address;
        this.minSallary = minSallary;
        this.maxSallary = maxSallary;
    }

    public int getImage() {
        return image;
    }

    public String getPosition() {
        return position;
    }

    public String getOffice() {
        return office;
    }

    public String getAddress() {
        return address;
    }

    public String getMinSallary() {
        return minSallary;
    }

    public String getMaxSallary() {
        return maxSallary;
    }
}
