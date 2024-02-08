package com.management.product.model.dto;


public class WorkOutLogDTO {
    private int logCode;
    private String workoutStatus;
    private String workoutDate;
    private String workoutSet;
    private String workoutCount;
    private String maxWeight;
    private int categoryCode;
    private CategoryDTO category;
    private int userCode;

    public WorkOutLogDTO() {
    }

    public WorkOutLogDTO(int logCode, String workoutStatus, String workoutDate, String workoutSet, String workoutCount, String maxWeight, int categoryCode, CategoryDTO category, int userCode) {
        this.logCode = logCode;
        this.workoutStatus = workoutStatus;
        this.workoutDate = workoutDate;
        this.workoutSet = workoutSet;
        this.workoutCount = workoutCount;
        this.maxWeight = maxWeight;
        this.categoryCode = categoryCode;
        this.category = category;
        this.userCode = userCode;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public String getWorkoutStatus() {
        return workoutStatus;
    }

    public void setWorkoutStatus(String workoutStatus) {
        this.workoutStatus = workoutStatus;
    }

    public String getWorkoutDate() {
        return workoutDate;
    }

    public void setWorkoutDate(String workoutDate) {
        this.workoutDate = workoutDate;
    }

    public String getWorkoutSet() {
        return workoutSet;
    }

    public void setWorkoutSet(String workoutSet) {
        this.workoutSet = workoutSet;
    }

    public String getWorkoutCount() {
        return workoutCount;
    }

    public void setWorkoutCount(String workoutCount) {
        this.workoutCount = workoutCount;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getLogCode() {
        return logCode;
    }

    public void setLogCode(int logCode) {
        this.logCode = logCode;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "WorkOutLogDTO{" +
                "logCode=" + logCode +
                ", workoutStatus='" + workoutStatus + '\'' +
                ", workoutDate='" + workoutDate + '\'' +
                ", workoutSet='" + workoutSet + '\'' +
                ", workoutCount='" + workoutCount + '\'' +
                ", maxWeight='" + maxWeight + '\'' +
                ", categoryCode=" + categoryCode +
                ", category=" + category +
                ", userCode=" + userCode +
                '}';
    }
}
