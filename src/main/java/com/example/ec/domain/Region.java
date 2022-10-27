package com.example.ec.domain;


public enum Region {
    CENTRAL_COAST("Central Coast"), SOUTHERN_CALIFORNIA("Southern California"), NORTHERN_CALIFORNIA("Northern California"), VARIES("Varies");
    private String lable;
    private Region(String label) {
        this.lable = label;
    }
    public static Region findByLabel(String byLabel){
        for (Region r: Region.values()){
            if (r.lable.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }
}
