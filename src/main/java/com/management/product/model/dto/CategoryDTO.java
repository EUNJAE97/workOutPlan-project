package com.management.product.model.dto;

public class CategoryDTO {
    private int categoryCode ;
    private String categoryName;
    private String categoryPart;

    public CategoryDTO() {

    }

    public CategoryDTO(int categoryCode, String categoryName, String categoryPart) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.categoryPart = categoryPart;
    }


    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryPart() {
        return categoryPart;
    }

    public void setCategoryPart(String categoryPart) {
        this.categoryPart = categoryPart;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", categoryPart='" + categoryPart + '\'' +
                '}';
    }
}
