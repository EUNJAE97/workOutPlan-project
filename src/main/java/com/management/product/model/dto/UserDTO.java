package com.management.product.model.dto;

public class UserDTO {
    private int userCode;
    private String userWeight;
    private String userHeight;
    private String userBodyFat;
    private String userMuscle;


    public UserDTO() {
    }

    public UserDTO(int userCode, String userWeight, String userHeight, String userBodyFat, String userMuscle) {
        this.userCode = userCode;
        this.userWeight = userWeight;
        this.userHeight = userHeight;
        this.userBodyFat = userBodyFat;
        this.userMuscle = userMuscle;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(String userWeight) {
        this.userWeight = userWeight;
    }

    public String getUserHeight() {
        return userHeight;
    }

    public void setUserHeigth(String userHeight) {
        this.userHeight = userHeight;
    }

    public String getUserBodyFat() {
        return userBodyFat;
    }

    public void setUserBodyFat(String userBodyFat) {
        this.userBodyFat = userBodyFat;
    }

    public String getUserMuscle() {
        return userMuscle;
    }

    public void setUserMuscle(String userMuscle) {
        this.userMuscle = userMuscle;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userCode=" + userCode +
                ", userWeight='" + userWeight + '\'' +
                ", userHeight='" + userHeight + '\'' +
                ", userBodyFat='" + userBodyFat + '\'' +
                ", userMuscle='" + userMuscle + '\'' +
                '}';
    }
}
