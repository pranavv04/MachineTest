package com.example.machinetest.model;

public class ProductResponseDTO {
    private int id;
    private String name;
    private String description;
    private int price;
    private int quantity;
    private String imageUrl;
    private String categoryName;

    public ProductResponseDTO(int id, String name, String description, int price, int quantity, String imageUrl, String categoryName){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.quantity=quantity;
        this.imageUrl=imageUrl;
        this.categoryName=categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
