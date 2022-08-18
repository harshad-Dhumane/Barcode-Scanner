package com.example.internship_project.DataObject;

public class AWSData {
    private String awbno;
    private String pincode;
    private String weight;

    public AWSData(String awbno,String pincode,String weight){
        this.awbno = awbno;
        this.pincode = pincode;
        this.weight = weight;
    }

    public void setAwbno(String awbno) {
        this.awbno = awbno;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAwbno() {
        return awbno;
    }

    public String getPincode() {
        return pincode;
    }

    public String getWeight() {
        return weight;
    }
}
